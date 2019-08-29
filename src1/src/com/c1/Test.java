package com.c1;

public class Test {

	public static void main(String[] args) {
		
		Main ob=new Main();
		
		//System.out.println(ob.div()); 
		
		//ob.largest();
		
		
        //ob.getGrade(77);
        
        // ob.pal();
		
        Phone obj=new Phone();
        
        Phone obj1=new Phone("Apple");
        
        Phone obj2=new Phone("Samsung","VA");
        
        System.out.println("------------------------------------------");
        
		Car obj3=new Car2();
		
		
		obj3.m1();
		
		obj3.m2();
		
		obj3.m3();
	    
		
		System.out.println("---------------------------------------------");
	   
		Car oob=new Car();
	    		
	    oob.m1();
	    oob.m2();
	    oob.m3();
	
	   Encp en=new Encp();
	   
	   en.setName("Hakan");
	   
	   en.setLastname("AK");
	
	   en.setAge(25);
	
	
	   System.out.println("My name is "+en.getName()+" last name is "+en.getLastname()+" and I am "+en.getAge()+" years old");
	
	}

}
