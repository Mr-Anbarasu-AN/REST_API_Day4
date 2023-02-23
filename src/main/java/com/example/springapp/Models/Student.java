package com.example.springapp.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_TB")
public class Student {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="studentName")
	private String studentName;
	
	@Column(name="departmentName")
	private String departmentName;
	
	@Column(name="emailId")
	private String emailId;
	
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getstudentName() {
		return studentName;
	}
	
	public String getdepartmentName() {
		return departmentName;
	}
	
	public String getemailId() {
		return emailId;
	}
	
}