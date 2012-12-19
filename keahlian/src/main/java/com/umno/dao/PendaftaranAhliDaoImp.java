package com.umno.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.umno.base.AbstractDao;
import com.umno.model.PendaftaranAhli;

@SuppressWarnings("unchecked")
@Repository
public class PendaftaranAhliDaoImp extends AbstractDao implements PendaftaranAhliDao {

	public List<PendaftaranAhli> listByTarikhTerima(Date tarikhTerima) {

		DetachedCriteria criteria = DetachedCriteria.forClass(PendaftaranAhli.class);
		
		if(tarikhTerima != null) {
			criteria.add(Restrictions.eq("tarikhTerima", tarikhTerima));
		}
		
		criteria.addOrder(Order.asc("noBorang"));
				
		return getHibernateTemplate().findByCriteria(criteria);
	}

	

}
