package com.umno.model.pendaftaran;

import java.util.Date;

import javax.persistence.Embeddable;

import com.umno.base.EmbeddedModel;

@Embeddable
public class PendaftaranF extends EmbeddedModel {

	private Date tarikhPermohonanTerima;
	
	private Date tarikhDiluluskan;
	
	private String noKpCawangan;
	
	private String noAhliCawangan;
	
	private String namaKetuaCawangan;
	
	private String noTel;

	public Date getTarikhPermohonanTerima() {
		return tarikhPermohonanTerima;
	}

	public void setTarikhPermohonanTerima(Date tarikhPermohonanTerima) {
		this.tarikhPermohonanTerima = tarikhPermohonanTerima;
	}

	public Date getTarikhDiluluskan() {
		return tarikhDiluluskan;
	}

	public void setTarikhDiluluskan(Date tarikhDiluluskan) {
		this.tarikhDiluluskan = tarikhDiluluskan;
	}

	
	public String getNoKpCawangan() {
		return noKpCawangan;
	}

	public void setNoKpCawangan(String noKpCawangan) {
		this.noKpCawangan = noKpCawangan;
	}

	public String getNoAhliCawangan() {
		return noAhliCawangan;
	}

	public void setNoAhliCawangan(String noAhliCawangan) {
		this.noAhliCawangan = noAhliCawangan;
	}

	public String getNamaKetuaCawangan() {
		return namaKetuaCawangan;
	}

	public void setNamaKetuaCawangan(String namaKetuaCawangan) {
		this.namaKetuaCawangan = namaKetuaCawangan;
	}

	public String getNoTel() {
		return noTel;
	}

	public void setNoTel(String noTel) {
		this.noTel = noTel;
	}
	 
	
}
