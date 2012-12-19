package com.umno.model.pendaftaran;

import java.util.Date;

import javax.persistence.Embeddable;

import com.umno.base.EmbeddedModel;

@Embeddable
public class PendaftaranH extends EmbeddedModel {
	
	private Date tarikhRayuanDiterima;
	
	private Date tarikhKeputusan;
	
	private String keputusanTindakan;
	
	private String noKpBaruMajlisTinggi;
	
	private String noAhliMajlisTinggi;
	
	private String namaMajlisTinggi;

	public Date getTarikhRayuanDiterima() {
		return tarikhRayuanDiterima;
	}

	public void setTarikhRayuanDiterima(Date tarikhRayuanDiterima) {
		this.tarikhRayuanDiterima = tarikhRayuanDiterima;
	}

	public Date getTarikhKeputusan() {
		return tarikhKeputusan;
	}

	public void setTarikhKeputusan(Date tarikhKeputusan) {
		this.tarikhKeputusan = tarikhKeputusan;
	}

	public String getKeputusanTindakan() {
		return keputusanTindakan;
	}

	public void setKeputusanTindakan(String keputusanTindakan) {
		this.keputusanTindakan = keputusanTindakan;
	}

	public String getNoKpBaruMajlisTinggi() {
		return noKpBaruMajlisTinggi;
	}

	public void setNoKpBaruMajlisTinggi(String noKpBaruMajlisTinggi) {
		this.noKpBaruMajlisTinggi = noKpBaruMajlisTinggi;
	}

	public String getNoAhliMajlisTinggi() {
		return noAhliMajlisTinggi;
	}

	public void setNoAhliMajlisTinggi(String noAhliMajlisTinggi) {
		this.noAhliMajlisTinggi = noAhliMajlisTinggi;
	}

	public String getNamaMajlisTinggi() {
		return namaMajlisTinggi;
	}

	public void setNamaMajlisTinggi(String namaMajlisTinggi) {
		this.namaMajlisTinggi = namaMajlisTinggi;
	}
	
	
}
