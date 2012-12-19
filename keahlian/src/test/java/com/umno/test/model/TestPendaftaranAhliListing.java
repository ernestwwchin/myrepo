package com.umno.test.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.umno.model.PendaftaranAhli;
import com.umno.test.base.AbstractTestCase;

public class TestPendaftaranAhliListing extends AbstractTestCase {
	
	@Test
	public void testIt() throws Exception {
		String id = "1";
		PendaftaranAhli pendaftaran = pendaftaranAhliDao.open(PendaftaranAhli.class, id);
		
		System.out.println(pendaftaran);
		
		assertNotNull(pendaftaran);
		
		System.out.println(pendaftaran.getPendaftaranA());;
	}
}
