package com.umno.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.umno.base.AbstractController;
import com.umno.dao.KodKawasanDao;
import com.umno.model.KodCawangan;
import com.umno.model.KodDun;
import com.umno.model.KodParlimen;
import com.umno.model.Negeri;

@SuppressWarnings("unchecked")
@Controller
public class KodKawasanController extends AbstractController {
	
	@RequestMapping(value = "/kod-kawasan/list.get", method = RequestMethod.GET)
	public String getKodParlimen(ModelMap model) throws Exception {
		
		List<KodParlimen> kodParlimenList = kodKawasanDao.listAll(KodParlimen.class);
		model.put("kodParlimenList", kodParlimenList);

		List<KodDun> kodDunList = kodKawasanDao.listAll(KodDun.class);
		model.put("kodDunList", kodDunList);

		List<KodCawangan> kodCawanganList = kodKawasanDao.listAll(KodCawangan.class);
		model.put("kodCawanganList", kodCawanganList);
		
		return "/kod-kawasan/list.jsp";
	}
	
	@RequestMapping(value = "/kod-kawasan/kod-parlimen.get", method = RequestMethod.GET)
	public String getKodParlimen(ModelMap model,
			@RequestParam(required=false) String kod) throws Exception {
		
		KodParlimen kodParlimen = null;
		
		if(kod != null) {
			kodParlimen = kodKawasanDao.open(KodParlimen.class, kod);
			model.put("kodParlimen", kodParlimen);
		}
		
		List<Negeri> negeriList = kodKawasanDao.listAllNegeri();
		model.put("negeriList", negeriList);
		
		return "/kod-kawasan/kod-parlimen.jsp";
	}

	@RequestMapping(value = "/kod-kawasan/kod-dun.get", method = RequestMethod.GET)
	public String getKodDun(ModelMap model,
			@RequestParam(required=false) String kod) throws Exception {
		
		KodDun kodDun = null;
		
		if(kod != null) {
			kodDun = kodKawasanDao.open(KodDun.class, kod);
			model.put("kodDun", kodDun);
		}
		
		String negeri = (kodDun != null) ? kodDun.getNegeri() : null;
		
		List<KodParlimen> kodParlimenList = kodKawasanDao.getKodParlimenByNegeri(negeri);
		model.put("kodParlimenList", kodParlimenList);
		
		List<Negeri> negeriList = kodKawasanDao.listAllNegeri();
		model.put("negeriList", negeriList);
		
		
		return "/kod-kawasan/kod-dun.jsp";
	}


	@RequestMapping(value = "/kod-kawasan/kod-cawangan.get", method = RequestMethod.GET)
	public String getKodCawangan(ModelMap model,
			@RequestParam(required=false) String kod) throws Exception {
		
		KodCawangan kodCawangan = null;
		
		if(kod != null) {
			kodCawangan = kodKawasanDao.open(KodCawangan.class, kod);
			model.put("kodCawangan", kodCawangan);
		}

		String negeri = (kodCawangan != null) ? kodCawangan.getNegeri() : null;
		String kodParlimen = (kodCawangan != null) ? kodCawangan.getKodParlimen() : null;
		
		List<KodDun> kodDunList = kodKawasanDao.getKodDunByKodParlimen(kodParlimen);
		model.put("kodDunList", kodDunList);
		
		List<KodParlimen> kodParlimenList = kodKawasanDao.getKodParlimenByNegeri(negeri);
		model.put("kodParlimenList", kodParlimenList);
		
		List<Negeri> negeriList = kodKawasanDao.listAllNegeri();
		model.put("negeriList", negeriList);
		
		
		return "/kod-kawasan/kod-cawangan.jsp";
	}

	@Resource
	private KodKawasanDao kodKawasanDao;
	
	private static final Logger log = Logger.getLogger(KodKawasanController.class);
	
}