package com.autowire;

public class Teacher {

	
	private Address address;

	


public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


@Override
	public String toString() {
		return "Teacher [address=" + address + "]";
	}


public Teacher(Address address) {
	super();
	this.address = address;
}


public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}