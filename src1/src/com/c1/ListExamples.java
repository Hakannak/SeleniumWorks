package com.c1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExamples {

	public static void main(String[] args) {
	
		ArrayList<Integer>alist=new ArrayList<>();
		
	    for(int a=1 ; a<=50 ; a++) {
	    	
	    	alist.add(a);
	    	
	    }

	System.out.println(alist);
	
	Iterator<Integer>it=alist.iterator();
	
	while(it.hasNext()) {
		
		int num=it.next();
		
		if(num%5==0) {
			
		     it.remove();
		}
	}
	
	System.out.println(alist);
	
	System.out.println("----------------------TASK 2 ----------------------------------");
	
	
	ArrayList<String>drinks=new ArrayList<>();
	
	drinks.add("Coke");
	drinks.add("lemonade");
	drinks.add("sprite");
	drinks.add("burn");
	drinks.add("redbul");
	drinks.add("fruit");
	
	for(int a=0; a<drinks.size(); a++) {
		
		String drink=drinks.get(a);
		
		if(drink.contains("a")  || drink.contains("e")) {
			
		        drinks.set(a, "water");
			     
			
		}
	}
	
	System.out.println(drinks);
	
	
	System.out.println("--------------------TASK 3-----------------------");
	
	
	ArrayList<String>car=new ArrayList<>();
	
	car.add("toyota");
	
	car.add("mercedes");
	
	car.add("honda");
	
	car.add("bmw");
	
	car.add("nissan");
	
	for(int i=0; i<car.size(); i++) {
		
		System.out.println(car.get(i));
	}
	
	System.out.println("------------------------------------------------");
	
	for(String cars : car) {
		
		System.out.println(cars);
	}
	
	System.out.println("-------------------------------------------------");
	
	Iterator<String>its=car.iterator();
	
	while(its.hasNext()) {
		
		String carss=its.next();
		
		System.out.println(carss);
	}
	
	System.out.println("-----------------------------------------------");
	
	int c=0;
	
	while(car.size()>c) {
		
		System.out.println(car.get(c));
	c++;
	
	}
	
	
	
	}

}
