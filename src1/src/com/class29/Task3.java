package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {

	public static void main(String[] args) {
		
		ArrayList<String>drinks=new ArrayList<String>();
	   
		drinks.add("lemonade");
		drinks.add("viski");
		drinks.add("fanta");
		drinks.add("coke");
		
		Iterator<String> it = drinks.iterator();
		
		for(int a=0;a<drinks.size();a++) {
			
			String drink=drinks.get(a);
			if(drink.contains("a") || drink.contains("e")) {
				drinks.set(a, "water");
			}
		}
	System.out.println(drinks);
	}

}
