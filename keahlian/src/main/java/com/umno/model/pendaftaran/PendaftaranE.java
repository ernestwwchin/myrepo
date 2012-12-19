package com.umno.model.pendaftaran;

import java.util.Date;

import javax.persistence.Embeddable;

import com.umno.base.EmbeddedModel;

@Embeddable
public class PendaftaranE extends EmbeddedModel {

	private String namaPencadang;
	
	private Date tarikhLanir;
	
	private String umur;
	
	private String jantina;
	
	private String negeriLahir;
	
	private String alamat1;
	
	private String alamat2;
	
	private String alamat3;
	
	private String poskod;
	
	private String bandar;
	
	private String negeri;
	
	private String telRumah;
	
	private String telBimbit;
	
	private String pekerjaan;
	
	private String email;

	public String getNamaPencadang() {
		return namaPencadang;
	}

	public void setNamaPencadang(String namaPencadang) {
		this.namaPencadang = namaPencadang;
	}

	public Date getTarikhLanir() {
		return tarikhLanir;
	}

	public void setTarikhLanir(Date tarikhLanir) {
		this.tarikhLanir = tarikhLanir;
	}

	public String getUmur() {
		return umur;
	}

	public void setUmur(String umur) {
		this.umur = umur;
	}

	public String getJantina() {
		return jantina;
	}

	public void setJantina(String jantina) {
		this.jantina = jantina;
	}

	public String getNegeriLahir() {
		return negeriLahir;
	}

	public void setNegeriLahir(String negeriLahir) {
		this.negeriLahir = negeriLahir;
	}

	public String getAlamat1() {
		return alamat1;
	}

	public void setAlamat1(String alamat1) {
		this.alamat1 = alamat1;
	}

	public String getAlamat2() {
		return alamat2;
	}

	public void setAlamat2(String alamat2) {
		this.alamat2 = alamat2;
	}

	public String getAlamat3() {
		return alamat3;
	}

	public void setAlamat3(String alamat3) {
		this.alamat3 = alamat3;
	}

	public String getPoskod() {
		return poskod;
	}

	public void setPoskod(String poskod) {
		this.poskod = poskod;
	}

	public String getBandar() {
		return bandar;
	}

	public void setBandar(String bandar) {
		this.bandar = bandar;
	}

	public String getNegeri() {
		return negeri;
	}

	public void setNegeri(String negeri) {
		this.negeri = negeri;
	}

	public String getTelRumah() {
		return telRumah;
	}

	public void setTelRumah(String telRumah) {
		this.telRumah = telRumah;
	}

	public String getTelBimbit() {
		return telBimbit;
	}

	public void setTelBimbit(String telBimbit) {
		this.telBimbit = telBimbit;
	}

	public String getPekerjaan() {
		return pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	
}
