package com.umno.test.base;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.umno.controller.KodKawasanController;
import com.umno.dao.KodKawasanDao;
import com.umno.dao.PendaftaranAhliDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath:/META-INF/settings.spring.xml",
		"classpath:/META-INF/controller-servlet.xml"})
public abstract class AbstractTestCase {
	@Resource
	protected KodKawasanDao kodKawasanDao;
	
	@Resource
	protected KodKawasanController kodKawasanController;
	
	@Resource
	protected PendaftaranAhliDao pendaftaranAhliDao;
	
}
