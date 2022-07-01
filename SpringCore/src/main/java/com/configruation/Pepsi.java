package com.configruation;

public class Pepsi {

	private int price;
	private int quantity;
	public Pepsi(int price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pepsi [price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
