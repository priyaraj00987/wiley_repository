package com.wiley.springcore.lifecycle;

public class Pizza {
	private double price;

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pizza(double price) {
		super();
		this.price = price;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.println("inside init method");
	}
	public void end() {
		System.out.println("Inside destroy method");
	}


}
