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
@Table(name="KOD_CAWANGAN")
public class KodCawangan extends AbstractModel implements Serializable {

	@Id
	@Column(length=10)
	private String kod;

	@Column(length=50)
	private String nama;

	@Column(length=50)
	private String kodDun;

	@Column(length=50)
	private String negeri;

	@ManyToOne
	@JoinColumn(name="negeri", insertable=false, updatable=false, nullable=false, referencedColumnName="kod")
	private Negeri negeriData = null;
	
	@ManyToOne
	@JoinColumn(name="kodDun", insertable=false, updatable=false, nullable=false, referencedColumnName="kod")
	private KodDun kodDunData = null;

	@Column(length=50)
	private String kodParlimen;

	@ManyToOne
	@JoinColumn(name="kodParlimen", insertable=false, updatable=false, nullable=false, referencedColumnName="kod")
	private KodParlimen kodParlimenData = null;
	
	public KodCawangan() {
		super();
	}
	
	public KodCawangan(String kodDun, String kod, String nama) {
		this();
		setKodDun(kodDun);
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

	public String getKodDun() {
		return kodDun;
	}

	public void setKodDun(String kodDun) {
		this.kodDun = kodDun;
	}

	public KodDun getKodDunData() {
		return kodDunData;
	}

	public void setKodDunData(KodDun kodDunData) {
		this.kodDunData = kodDunData;
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

	
}