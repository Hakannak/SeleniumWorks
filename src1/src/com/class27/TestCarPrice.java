package com.class27;

public class TestCarPrice {

public static void main(String[] args) {
		
		Car car;
		
		car =new Sedan("blue", 25000, 3000);
		double carPrice=car.calculateSalePrice();
		System.out.println(carPrice);
		
		car =new Truck("blue", 25000, 3000);
		double carPrice1=car.calculateSalePrice();
		System.out.println(carPrice1);
	}
}