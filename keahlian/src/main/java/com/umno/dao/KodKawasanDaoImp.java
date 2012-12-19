package com.umno.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.umno.base.AbstractDao;
import com.umno.model.KodCawangan;
import com.umno.model.KodDun;
import com.umno.model.KodParlimen;
import com.umno.model.Negeri;

@SuppressWarnings("unchecked")
@Repository
public class KodKawasanDaoImp extends AbstractDao implements KodKawasanDao {
	

	@Override
	public List<Negeri> listAllNegeri() {
		return listAll(Negeri.class);
	}
	
	@Override
	public List<KodCawangan> getKodCawanganByKodDun(String kodDun) {

		DetachedCriteria criteria = DetachedCriteria.forClass(KodCawangan.class);
		
		if(kodDun != null) {
			criteria.add(Restrictions.eq("kodDun", kodDun));
		}
		
		criteria.addOrder(Order.asc("nama"));
				
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public List<KodDun> getKodDunByKodParlimen(String kodParlimen) {

		DetachedCriteria criteria = DetachedCriteria.forClass(KodDun.class);
		
		if(kodParlimen != null) {
			criteria.add(Restrictions.eq("kodParlimen", kodParlimen));
		}
		
		criteria.addOrder(Order.asc("nama"));
				
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public List<KodParlimen> getKodParlimenByNegeri(String negeri) {

		DetachedCriteria criteria = DetachedCriteria.forClass(KodParlimen.class);

		if(negeri != null) {
			criteria.add(Restrictions.eq("negeri", negeri));
		}
		
		criteria.addOrder(Order.asc("nama"));
				
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public List<KodDun> getKodDunByNegeri(String negeri) {

		DetachedCriteria criteria = DetachedCriteria.forClass(KodDun.class);

		if(negeri != null) {
			criteria.add(Restrictions.eq("negeri", negeri));
		}
		
		criteria.addOrder(Order.asc("nama"));
				
		return getHibernateTemplate().findByCriteria(criteria);
	}
	
	
}
