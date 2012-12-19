package com.umno.base;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@SuppressWarnings("unchecked")
public abstract class AbstractController {

	public AbstractController() {
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
	}
	
	private SimpleDateFormat dateFormat;
	
    public void setDateFormat(String format) {
		this.dateFormat = new SimpleDateFormat(format);
		dateFormat.setLenient(false);
	}

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

		
}
