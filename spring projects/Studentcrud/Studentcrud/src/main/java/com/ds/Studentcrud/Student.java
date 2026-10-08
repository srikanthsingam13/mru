package com.ds.Studentcrud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private String scourse;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer sid, String sname, String scourse) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scourse = scourse;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	
	
	
}
