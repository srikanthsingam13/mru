package com.beta.EmployeeCrud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empid;
	private String  empname;
	private String  empemail;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empid, String empname, String empemail) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empemail = empemail;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	
	
	
	
}
