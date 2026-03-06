package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Employees {
	@Id
	private int id;
	private String email;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employees(int id, String email, double salary) {
		super();
		this.id = id;
		this.email = email;
		this.salary = salary;
	}
	
	public Employees() {
		
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", email=" + email + ", salary=" + salary + "]";
	}
	

}
