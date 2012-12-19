package com.umno.test.model;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;

import com.umno.model.KodCawangan;
import com.umno.model.KodDun;
import com.umno.model.KodParlimen;
import com.umno.test.base.AbstractTestCase;

public class TestKodKawasanListing extends AbstractTestCase {
	
	@Test
	public void testIt() throws Exception {
		
		String negeri = "Selangor";
		List<KodParlimen> kodParlimenList = kodKawasanDao.getKodParlimenByNegeri(negeri);
		
		assertFalse(kodParlimenList.isEmpty());
		for (KodParlimen kodParlimen : kodParlimenList) {
			System.out.println(kodParlimen);
		}
		
		List<KodDun> kodDunList = kodKawasanDao.getKodDunByKodParlimen(kodParlimenList.get(0).getKod());
		
		assertFalse(kodDunList.isEmpty());
		for (KodDun kodDun : kodDunList) {
			System.out.println(kodDun);
		}

		List<KodCawangan> kodCawanganList = kodKawasanDao.getKodCawanganByKodDun(kodDunList.get(0).getKod());
		
		assertFalse(kodCawanganList.isEmpty());
		for (KodCawangan kodCawangan : kodCawanganList) {
			System.out.println(kodCawangan);
		}
	}
}
