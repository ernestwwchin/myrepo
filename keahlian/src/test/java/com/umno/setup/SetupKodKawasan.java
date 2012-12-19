package com.umno.setup;

import org.junit.Test;

import com.umno.model.KodCawangan;
import com.umno.model.KodDun;
import com.umno.model.KodParlimen;
import com.umno.test.base.AbstractTestCase;

public class SetupKodKawasan extends AbstractTestCase {
	
	@Test
	public void testIt() throws Exception {
		
		KodParlimen parlimen1 = new KodParlimen("Selangor", "PJS", "Petaling Jaya Selatan");
		KodParlimen parlimen2 = new KodParlimen("Selangor", "PJU", "Petaling Jaya Utara");
		
		KodDun dun1 = new KodDun(parlimen1.getKod(), "TM", "Taman Medan");
		
		KodCawangan cawangan1 = new KodCawangan(dun1.getKod(), "PJS 3/12", "Jalan PJS 3/12");
		

		kodKawasanDao.insert(parlimen1);
		kodKawasanDao.insert(parlimen2);
		kodKawasanDao.insert(dun1);
		kodKawasanDao.insert(cawangan1);
		
		kodKawasanDao.flush();
		
	}
}
