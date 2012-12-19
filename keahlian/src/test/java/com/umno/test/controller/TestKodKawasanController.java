package com.umno.test.controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import com.umno.model.KodParlimen;
import com.umno.test.base.AbstractTestCase;

public class TestKodKawasanController extends AbstractTestCase {
	
	@Test
	public void testIt() throws Exception {
		ModelMap model = new ModelMap();
		String negeri = "Selangor";
		
		kodKawasanController.getKodParlimen(model, negeri);
		
		List<KodParlimen> kodParlimenList = (List<KodParlimen>)model.get("kodParlimenList");
		assertNotNull(kodParlimenList);
		assertFalse(kodParlimenList.isEmpty());
		
		for (KodParlimen kodParlimen : kodParlimenList) {
			System.out.println(kodParlimen);
		}
	}
}
