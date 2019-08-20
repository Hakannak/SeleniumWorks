package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
		
		ArrayList<String>words=new ArrayList<String>();
		
		words.add("hello");
		words.add("produce");
		words.add("pay");
		words.add("derisive");
		words.add("bliss");
		
		Iterator<String> it = words.iterator();
		
     	while(it.hasNext()) {
     		
     		String a=it.next();
     		
     		if(a.endsWith("e")) {
     			it.remove();
     		}
     	}
	
	System.out.println(words); 
	
	}

}
