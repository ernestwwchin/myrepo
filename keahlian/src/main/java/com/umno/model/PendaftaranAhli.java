package com.umno.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.umno.base.AbstractModel;
import com.umno.model.pendaftaran.PendaftaranA;
import com.umno.model.pendaftaran.PendaftaranB;
import com.umno.model.pendaftaran.PendaftaranD;
import com.umno.model.pendaftaran.PendaftaranE;
import com.umno.model.pendaftaran.PendaftaranF;
import com.umno.model.pendaftaran.PendaftaranH;
import com.umno.model.pendaftaran.PendaftaranI;

@SuppressWarnings("serial")
@Entity
@Table(name="PENDAFTARAN_AHLI")
public class PendaftaranAhli extends AbstractModel implements Serializable {

	@Id
	private String id;

	private PendaftaranA pendaftaranA;

	private PendaftaranB pendaftaranB;
	
	private PendaftaranD pendaftaranD;
	
	private PendaftaranE pendaftaranE;
	
	private PendaftaranF pendaftaranF;
	
	private PendaftaranH pendaftaranH;
	
	private PendaftaranI pendaftaranI;
	
	public PendaftaranAhli() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PendaftaranA getPendaftaranA() {
		return pendaftaranA;
	}

	public void setPendaftaranA(PendaftaranA pendaftaranA) {
		this.pendaftaranA = pendaftaranA;
	}

	public PendaftaranB getPendaftaranB() {
		return pendaftaranB;
	}

	public void setPendaftaranB(PendaftaranB pendaftaranB) {
		this.pendaftaranB = pendaftaranB;
	}

	public PendaftaranD getPendaftaranD() {
		return pendaftaranD;
	}

	public void setPendaftaranD(PendaftaranD pendaftaranD) {
		this.pendaftaranD = pendaftaranD;
	}

	public PendaftaranE getPendaftaranE() {
		return pendaftaranE;
	}

	public void setPendaftaranE(PendaftaranE pendaftaranE) {
		this.pendaftaranE = pendaftaranE;
	}

	public PendaftaranF getPendaftaranF() {
		return pendaftaranF;
	}

	public void setPendaftaranF(PendaftaranF pendaftaranF) {
		this.pendaftaranF = pendaftaranF;
	}

	public PendaftaranH getPendaftaranH() {
		return pendaftaranH;
	}

	public void setPendaftaranH(PendaftaranH pendaftaranH) {
		this.pendaftaranH = pendaftaranH;
	}

	public PendaftaranI getPendaftaranI() {
		return pendaftaranI;
	}

	public void setPendaftaranI(PendaftaranI pendaftaranI) {
		this.pendaftaranI = pendaftaranI;
	}

	
	
}