package com.umno.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.umno.base.AbstractModel;

@SuppressWarnings("serial")
@Entity
@Table(name="NEGERI")
public class Negeri extends AbstractModel implements Serializable {

	@Id
	@Column(length=10)
	private String kod;

	@Column(length=50)
	private String nama;
	
	public Negeri() {
		super();
	}
	
	public Negeri(String kod, String nama) {
		this();
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

	
}