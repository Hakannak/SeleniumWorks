package com.class31;

import java.util.*;

public class TaskMap {

	public static void main(String[] args) {
		
		/*Create a Map from array of cities that will sort keys in alphabetical order. 
		 * As a key store the name of the city and as a value store the length of the city name (Example: Paris=5, Moscow =6 etc..).
		 * If any city name is more than 7 characters remove that city ( use entrySet with Iterator ).
		 * 
		 */

		Map <String, Integer> city=new LinkedHashMap<>();
		
		//Object key;
		//String key = "Istanbul";
		city.put("Istanbul", "Istanbul".length());
		city.put("Ankara", "Ankara".length());
		city.put("Trabzon", "Trabzon".length());
		city.put("Sakarya", "Sakarya".length());
		city.put("Izmir", "Izmir".length());
		System.out.println(city.size());
		
		Iterator <Map.Entry<String, Integer>> it=city.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			String keytest=(String) entry.getKey();
			if (keytest.length()>7) {
				it.remove();
				
			}
			
		}
		System.out.println(city);
		
		
	}

}