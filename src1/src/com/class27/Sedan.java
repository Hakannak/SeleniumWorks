package com.class27;

public class Sedan extends Car{

int length;
	
	public Sedan(String color, double carPrice, int length) {
		super(color, carPrice);
		this.length=length;
	}
	public double calculateSalePrice() {
		
		if (length>20) {
			carPrice-=carPrice*0.05;
		}else {
			carPrice-=carPrice*0.1;
		}
		return carPrice;
	}
}
