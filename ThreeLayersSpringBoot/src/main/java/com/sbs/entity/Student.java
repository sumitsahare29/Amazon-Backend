package com.sbs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	private int id;
	
	private String name;
	
	private String schoolname;
	
	private long mobno;
	
	private String address;

	public Student() {
		super();
	}

	public Student(String name, String schoolname, long mobno, String address) {
		super();
		this.name = name;
		this.schoolname = schoolname;
		this.mobno = mobno;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
