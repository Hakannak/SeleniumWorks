package com.class31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		List<String> aList=new ArrayList<String>();
		    aList.add("John");
	        aList.add("Jane");
	        aList.add("James");
	        aList.add("Jasmine");
	        aList.add("Jane");
	        aList.add("James");

	        System.out.println("before duplicating "+aList);
	        
	        Set<String>newList=new HashSet<>(aList);
	        
	        System.out.println("after duplicating "+newList);
	}

}
