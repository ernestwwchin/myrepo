package com.umno.dao;

import java.util.Date;
import java.util.List;

import com.umno.base.Dao;
import com.umno.model.PendaftaranAhli;


public interface PendaftaranAhliDao extends Dao {

	List<PendaftaranAhli> listByTarikhTerima(Date tarikhTerima);

	

}
