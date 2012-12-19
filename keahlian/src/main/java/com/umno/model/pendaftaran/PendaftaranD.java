package com.umno.model.pendaftaran;

import java.util.Date;

import javax.persistence.Embeddable;

import com.umno.base.EmbeddedModel;

@Embeddable
public class PendaftaranD extends EmbeddedModel {

	private String kodKategori;
	
	private Date tarikhPermohon;
	
	private Boolean daftarSpr;

	public String getKodKategori() {
		return kodKategori;
	}

	public void setKodKategori(String kodKategori) {
		this.kodKategori = kodKategori;
	}

	public Date getTarikhPermohon() {
		return tarikhPermohon;
	}

	public void setTarikhPermohon(Date tarikhPermohon) {
		this.tarikhPermohon = tarikhPermohon;
	}

	public Boolean getDaftarSpr() {
		return daftarSpr;
	}

	public void setDaftarSpr(Boolean daftarSpr) {
		this.daftarSpr = daftarSpr;
	}
	
	
}
