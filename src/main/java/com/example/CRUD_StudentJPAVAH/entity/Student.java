package com.example.CRUD_StudentJPAVAH.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String sdt;
	private String diachi;
	
	public Student() {
		
	}
	public Student(String name, String sdt, String diachi) {
		super();
		this.name = name;
		this.sdt = sdt;
		this.diachi = diachi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sdt=" + sdt + ", diachi=" + diachi + "]";
	}
	
	
	
}
