package com.umno.dao;

import java.util.List;

import com.umno.base.Dao;
import com.umno.model.KodCawangan;
import com.umno.model.KodDun;
import com.umno.model.KodParlimen;
import com.umno.model.Negeri;


public interface KodKawasanDao extends Dao {

	List<KodCawangan> getKodCawanganByKodDun(String codeDun);
	
	List<KodDun> getKodDunByKodParlimen(String codeParlimen);
	
	List<KodParlimen> getKodParlimenByNegeri(String negeri);
	
	List<KodDun> getKodDunByNegeri(String negeri);
	
	List<Negeri> listAllNegeri();

	

}
