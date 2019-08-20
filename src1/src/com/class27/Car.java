package com.class27;

public class Car {
   
	String color;
	double carPrice;
	
	public Car(String color, double carPrice) {
		this.color=color;
		this.carPrice=carPrice;
	}
	public double calculateSalePrice() {
		return carPrice;
	}
}