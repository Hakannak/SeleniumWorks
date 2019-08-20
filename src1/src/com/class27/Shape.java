package com.class27;

public interface Shape {

	void calculateArea();
	void calculatePerimiter();
	
}


class Circle implements Shape{

	
	public void calculateArea() {
		
		System.out.println("The formula is 3.14*r*r for calculating are of circle");
		
	}


	public void calculatePerimiter() {
		System.out.println("The formula is 3.14*r*2 for calculating perimiter of circle");
		
	}
	
}
class Square implements Shape{

	
	public void calculateArea() {
		
		System.out.println("The formula is a*a for calculating are of square");
		
	}


	public void calculatePerimiter() {
		
		System.out.println("The formula is 4*a for calculating perimiter of circle");
		
		
	}
	
}