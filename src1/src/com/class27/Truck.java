
package com.class27;

public class Truck extends Car {


	int weight;
	
	public Truck(String color, double carPrice,int weight) {
		super(color, carPrice);
		this.weight=weight;
	}
	public double calculateSalePrice() {
		
		if (weight>2000) {
			carPrice-=carPrice*0.1;
		}else {
			carPrice-=carPrice*0.2;
		}
		return carPrice;
	}
}