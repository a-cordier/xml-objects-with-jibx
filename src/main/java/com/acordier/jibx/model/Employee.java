package com.acordier.jibx.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String hireDate;
	
	public Employee(){}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
}
