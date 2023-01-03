package com.hcl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
	
	@Id
	private String serialNo;
	private String price;
	
	@OneToOne
	private Student student;
	
	public Laptop() {
		
	}
	public Laptop(String serialNo, String price) {
		super();
		this.serialNo = serialNo;
		this.price = price;
	}
	
	public Laptop(String serialNo, String price, Student student) {
		super();
		this.serialNo = serialNo;
		this.price = price;
		this.student = student;
	}
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
