package com.umno.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.CacheMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Property;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
public abstract class AbstractDao implements Dao {

	public final static int INSERT_BATCH_SIZE = 100;
	
	protected HibernateTemplate hibernateTemplate;
	
	@Resource
	public void createTemplate(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Override
	@Transactional(readOnly = true, timeout = 10)
	public <T extends AbstractModel> List<T> listAll(Class<T> clazz) {
		return getHibernateTemplate().loadAll(clazz);
	}
	

	@Override
	public <T extends AbstractModel> Map<String, T> listForMap(Class<T> clazz) {
		Map<String, T> map = new LinkedHashMap<String, T>();
		
		List<T> list = listAll(clazz);
            
        for (T t : list) {
			map.put(t.getId(), t);
		}
		
		return map;
	}
	
	
	@Override
	@Transactional(readOnly = true, timeout = 5)
	public <T extends AbstractModel> T open(Class<T> clazz, Serializable id) {
		return (T)getHibernateTemplate().get(clazz, id);
	}

	private final static String countQueryTemplate = "select count(%1$s) from %2$s where %1$s = '%3$s'";

	@Override
	@Transactional(readOnly = true, timeout = 10)
	public <T extends AbstractModel> boolean exists(Class<T> clazz, String idName, Serializable id) {
		String sql = String.format(countQueryTemplate, 
				idName, clazz.getSimpleName(), id);
		
		Number count = (Number)getHibernateTemplate().getSessionFactory()
			.getCurrentSession().createQuery(sql).uniqueResult();
		
		return count != null && count.intValue() > 0;
	}
	
	@Override
	@Transactional(readOnly = true, timeout = 5)
	public <T extends AbstractModel> List<T> openAll(Class<T> clazz, String idName, Serializable[] ids) {
		if(ids == null || ids.length == 0) return new ArrayList<T>();
		
		DetachedCriteria criteria = DetachedCriteria.forClass(clazz)
			.setResultTransformer(DetachedCriteria.DISTINCT_ROOT_ENTITY)
			.add(Property.forName(idName).in(ids))
			.addOrder(Order.asc(idName));
		
		return getHibernateTemplate().findByCriteria(criteria);
	}
	
	@Override
	@Transactional(timeout = 5)
	public Serializable insert(Object data) {
		return getHibernateTemplate().save(data);
	}

	@Override
	public List<Serializable> insertAll(Collection list) {
		List<Serializable> idList = new ArrayList<Serializable>();
		
		if(list == null || list.size() == 0) return idList;
		
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		session.setCacheMode(CacheMode.IGNORE);
		
		try {
			Transaction tx = session.beginTransaction();
			
			int i = 0;
			for (Object o : list) {
				idList.add(getHibernateTemplate().save(o));
				
				if(i % INSERT_BATCH_SIZE == 0) {
					session.flush();
					session.clear();
				}
				
				i++;
			}
			
			tx.commit();
		} finally {
			session.close();
		}
		
		return idList;
	}
	
	@Override
	public void update(Object data) {
		getHibernateTemplate().update(data);
	}
	
	@Override
	public void updateAll(Collection list) {
		getHibernateTemplate().saveOrUpdateAll(list);
	}
	
	@Override
	public void delete(Object data) {
		getHibernateTemplate().delete(data);
	}

	@Override
	public void deleteAll(Collection data) {
		getHibernateTemplate().deleteAll(data);
	}

	@Override
	public void saveOrUpdate(Object data) {
		getHibernateTemplate().saveOrUpdate(data);			
	}

    @Override
    public void flush(){
        getHibernateTemplate().flush();
    }
}
