package com.class31;

import java.util.*;

public class MapTask {

	public static void main(String[] args) {

		Map<String, String> alist = new HashMap<>();

		alist.put("Turkey", "Ankara");
		alist.put("England", "London");
		alist.put("U.S.A", "DC");
		alist.put("France", "Paris");
		alist.put("Germany", "Berlin");
		alist.put("Italy", "Rome");

		Set<String> keys = alist.keySet();

		for (String key : keys) {

			System.out.println(key + ":" + alist.get(key));
		}

		System.out.println("---------------------------------------------");

		Iterator<String> keysIt = keys.iterator();
		while (keysIt.hasNext()) {
			String key = keysIt.next();
			System.out.println(key + ":" + alist.get(key));
		}

		System.out.println("-----------------------------");
		Collection<String> value = alist.values();

		for (String values : value) {

			System.out.println(values);
		}

		System.out.println("-----iterator------");

		Iterator<String> it = alist.values().iterator();
		while (it.hasNext()) {
        String all=it.next();
        System.out.println(all);
		}
	  
	
	}
}