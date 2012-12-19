package com.umno.test.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.umno.model.KodCawangan;
import com.umno.model.KodDun;
import com.umno.model.KodParlimen;
import com.umno.test.base.AbstractTestCase;

public class TestKodKawasanRetrieve extends AbstractTestCase {
	
	@Test
	public void testIt() throws Exception {
		KodCawangan kodCawangan = kodKawasanDao.open(KodCawangan.class, "PJS 3/12");
		assertNotNull(kodCawangan);
		
		KodDun kodDun = kodCawangan.getKodDunData();
		assertNotNull(kodDun);
		
		KodParlimen kodParlimen = kodDun.getKodParlimenData();
		assertNotNull(kodParlimen);
		
		System.out.println(kodParlimen);
		System.out.println(kodDun);
		System.out.println(kodCawangan);
	}
}
