package com.configruation;

public class Laptop {
	
	private int price;
	private int quantity;
	
	public Laptop(int price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", quantity=" + quantity + "]";
	}

}
