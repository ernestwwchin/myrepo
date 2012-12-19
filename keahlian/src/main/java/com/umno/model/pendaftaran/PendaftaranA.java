package com.umno.model.pendaftaran;

import java.util.Date;

import javax.persistence.Embeddable;

import com.umno.base.EmbeddedModel;

@Embeddable
public class PendaftaranA extends EmbeddedModel {

	private String noRujukan;
	
	private String noAhli;
	
	private Date tarikhTerima;
	
	private String kodNegeri;
	
	private String kodBahagian;
	
	private String kodCawangan;

	public String getNoRujukan() {
		return noRujukan;
	}

	public void setNoRujukan(String noRujukan) {
		this.noRujukan = noRujukan;
	}

	public String getNoAhli() {
		return noAhli;
	}

	public void setNoAhli(String noAhli) {
		this.noAhli = noAhli;
	}

	public Date getTarikhTerima() {
		return tarikhTerima;
	}

	public void setTarikhTerima(Date tarikhTerima) {
		this.tarikhTerima = tarikhTerima;
	}

	public String getKodNegeri() {
		return kodNegeri;
	}

	public void setKodNegeri(String kodNegeri) {
		this.kodNegeri = kodNegeri;
	}

	public String getKodBahagian() {
		return kodBahagian;
	}

	public void setKodBahagian(String kodBahagian) {
		this.kodBahagian = kodBahagian;
	}

	public String getKodCawangan() {
		return kodCawangan;
	}

	public void setKodCawangan(String kodCawangan) {
		this.kodCawangan = kodCawangan;
	}
	
	
}
