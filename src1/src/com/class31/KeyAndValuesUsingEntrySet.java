package com.class31;

import java.util.*;

public class KeyAndValuesUsingEntrySet {

	public static void main(String[] args) {
		// Create a map to store userDetails(name, salary, department, title)

		Map<String, String> userDetailsMap = new LinkedHashMap<>();
		userDetailsMap.put("Name", "Alex Smith");//1 entry=Key=Name + value="Alex Smith"
		userDetailsMap.put("Salary", "90000");// 2 entry
		userDetailsMap.put("Department", "IT");//3 entry
		userDetailsMap.put("Title", "Automation Tester");//4 entry

		System.out.println(userDetailsMap);
		userDetailsMap.entrySet();// returns a set of entries

		for (Map.Entry<String, String> entry : userDetailsMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("Using iterator------------------------------------");
		
		Iterator<Map.Entry<String, String>> it=userDetailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	
	
	
	
	}
}
