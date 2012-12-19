package com.umno.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.umno.base.AbstractModel;

@SuppressWarnings("serial")
@Entity
@Table(name="KOD_DUN")
public class KodDun extends AbstractModel implements Serializable {

	@Id
	@Column(length=10)
	private String kod;

	@Column(length=50)
	private String nama;

	@Column(length=50)
	private String negeri;

	@ManyToOne
	@JoinColumn(name="negeri", insertable=false, updatable=false, nullable=false, referencedColumnName="kod")
	private Negeri negeriData = null;
	
	@Column(length=50)
	private String kodParlimen;

	@ManyToOne
	@JoinColumn(name="kodParlimen", insertable=false, updatable=false, nullable=false, referencedColumnName="kod")
	private KodParlimen kodParlimenData = null;
	
	public KodDun() {
		super();
	}
	
	public KodDun(String kodParlimen, String kod, String nama) {
		this();
		setKodParlimen(kodParlimen);
		setKod(kod);
		setNama(nama);
	}

	@Override
	public String getId() {
		return getKod();
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKodParlimen() {
		return kodParlimen;
	}

	public void setKodParlimen(String kodParlimen) {
		this.kodParlimen = kodParlimen;
	}

	public KodParlimen getKodParlimenData() {
		return kodParlimenData;
	}

	public void setKodParlimenData(KodParlimen kodParlimenData) {
		this.kodParlimenData = kodParlimenData;
	}

	public String getNegeri() {
		return negeri;
	}

	public void setNegeri(String negeri) {
		this.negeri = negeri;
	}

	public Negeri getNegeriData() {
		return negeriData;
	}

	public void setNegeriData(Negeri negeriData) {
		this.negeriData = negeriData;
	}

	
	
}
