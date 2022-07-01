package com.collection;

import java.util.*;

public class Employee {
	private Set<Integer> empId;
	private List<String> empName;
	private Map<Integer,String>empDetails ;
	public Set<Integer> getEmpId() {
		return empId;
	}
	public void setEmpId(Set<Integer> empId) {
		this.empId = empId;
	}
	public List<String> getEmpName() {
		return empName;
	}
	public void setEmpName(List<String> empName) {
		this.empName = empName;
	}
	public Map<Integer, String> getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(Map<Integer, String> empDetails) {
		this.empDetails = empDetails;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDetails=" + empDetails + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
