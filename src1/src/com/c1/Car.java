package com.c1;

public class Car {

	
	public void m1() {
		
		System.out.println("This is m1 in Parent Class");
		
	}

     void m2() {
	   this.m1();
	   System.out.println("This is m2 in Parent Class");
   }
   
   
     protected void m3() {
	   this.m2();
	   System.out.println("This is m3 in Parent Class");
   }

    public static void main(String[] args) {
    	
    	Car c=new Car();
    	
    	c.m1();
    	c.m2();
    	c.m3();
    }


}

class Car2 extends Car{
	
	public void m1() {
	    
		System.out.println("This is m1 from sub class");
	}
  
	 void m2() {
		   
		   System.out.println("This is m2 in sub Class");
	   }
	   
	   
	     protected void m3() {
		   
		   System.out.println("This is m3 in sub Class");
	   }
    


}