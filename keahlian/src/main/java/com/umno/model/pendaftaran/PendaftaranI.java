package com.umno.model.pendaftaran;

import java.util.Date;

import javax.persistence.Embeddable;

import com.umno.base.EmbeddedModel;

@Embeddable
public class PendaftaranI extends EmbeddedModel {

	private Date tarikhPermohonanDisahkan;
	
	private String kodStatus;
	
	private Boolean autoAdd;

	public Date getTarikhPermohonanDisahkan() {
		return tarikhPermohonanDisahkan;
	}

	public void setTarikhPermohonanDisahkan(Date tarikhPermohonanDisahkan) {
		this.tarikhPermohonanDisahkan = tarikhPermohonanDisahkan;
	}

	public String getKodStatus() {
		return kodStatus;
	}

	public void setKodStatus(String kodStatus) {
		this.kodStatus = kodStatus;
	}

	public Boolean getAutoAdd() {
		return autoAdd;
	}

	public void setAutoAdd(Boolean autoAdd) {
		this.autoAdd = autoAdd;
	}
	
	
}
