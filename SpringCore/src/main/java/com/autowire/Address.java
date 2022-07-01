package com.autowire;

public class Address {
	
	private int houseNumber;
	private String cityName;
	private String stateName;
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", cityName=" + cityName + ", stateName=" + stateName + "]";
	}
	
	
	public Address(int houseNumber, String cityName, String stateName) {
		super();
		this.houseNumber = houseNumber;
		this.cityName = cityName;
		this.stateName = stateName;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
