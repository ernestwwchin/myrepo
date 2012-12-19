package com.umno.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public interface Dao {

	<T extends AbstractModel> List<T> listAll(Class<T> clazz);
	
	<T extends AbstractModel> Map<String, T> listForMap(Class<T> clazz);
	
	<T extends AbstractModel> T open(Class<T> clazz, Serializable id);

	<T extends AbstractModel> boolean exists(Class<T> clazz, String idName, Serializable id);

	<T extends AbstractModel> List<T> openAll(Class<T> clazz, String idName, Serializable[] ids);

	Serializable insert(Object data);

	List<Serializable> insertAll(Collection list);

	void update(Object data);

	void updateAll(Collection list);

	void delete(Object data);

	void deleteAll(Collection data);

	void saveOrUpdate(Object data);

	void flush();

	
	

}
