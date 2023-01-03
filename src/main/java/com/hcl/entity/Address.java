package com.hcl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "addres")
public class Address {
	
	@Id
	private String id;
	private String city;
	private String houseNumber;
	private String state;
	
	@ManyToOne
	private Student student;
	
	public Address() {
		
	}

	public Address(String id, String city, String houseNumber, String state) {
		super();
		this.id = id;
		this.city = city;
		this.houseNumber = houseNumber;
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
