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
@Table(name = "KOD_PARLIMEN")
public class KodParlimen extends AbstractModel implements Serializable {

	@Id
	@Column(length = 10)
	private String kod;

	@Column(length = 50)
	private String nama;

	@Column(length = 50)
	private String negeri;

	@ManyToOne
	@JoinColumn(name="negeri", insertable=false, updatable=false, nullable=false, referencedColumnName="kod")
	private Negeri negeriData = null;
	
	public KodParlimen() {
		super();
	}
	
	public KodParlimen(String negeri, String kod, String nama) {
		this();
		setNegeri(negeri);
		setKod(kod);
		setNama(nama);
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

	public String getNegeri() {
		return negeri;
	}

	public void setNegeri(String negeri) {
		this.negeri = negeri;
	}

	@Override
	public String getId() {
		return getKod();
	}

	public Negeri getNegeriData() {
		return negeriData;
	}

	public void setNegeriData(Negeri negeriData) {
		this.negeriData = negeriData;
	}

	
}
