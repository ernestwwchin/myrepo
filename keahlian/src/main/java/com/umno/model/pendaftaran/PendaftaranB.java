package com.umno.model.pendaftaran;

import java.util.Date;

import javax.persistence.Embeddable;

import com.umno.base.EmbeddedModel;

@Embeddable
public class PendaftaranB extends EmbeddedModel {

	private String noBorang;
	
	private String noKpBaru;
	
	private String noKpLama;
	
	private String nama;

	public String getNoBorang() {
		return noBorang;
	}

	public void setNoBorang(String noBorang) {
		this.noBorang = noBorang;
	}

	public String getNoKpBaru() {
		return noKpBaru;
	}

	public void setNoKpBaru(String noKpBaru) {
		this.noKpBaru = noKpBaru;
	}

	public String getNoKpLama() {
		return noKpLama;
	}

	public void setNoKpLama(String noKpLama) {
		this.noKpLama = noKpLama;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	
}
