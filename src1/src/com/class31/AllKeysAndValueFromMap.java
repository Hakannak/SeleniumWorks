package com.class31;

import java.util.*;

public class AllKeysAndValueFromMap {

	public static void main(String[] args) {

		Map<Integer, String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		System.out.println(map);
		//How to get All KYES
		//returns a Set of keys from the map
		Set <Integer> keys=map.keySet();
		//how to print all keys?
		System.out.println("Using for each loop--------------");
		for (Integer key: keys) {
			System.out.println(key+":"+map.get(key));
		}
		System.out.println();
		System.out.println("Using iterator--------------");
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			Integer key=keysIt.next();
			System.out.println(key+":"+map.get(key));
		}
		
		//How to get All Values
		//return collection of values from a map
		Collection <String > valCol=map.values();
		System.out.println("Using for each loop--------------");
		for (String value: valCol) {
			System.out.print(value+", ");
		}
		System.out.println();
		System.out.println("Using iterator--------------");
		
		Iterator<String> itValues=valCol.iterator();
		while(itValues.hasNext()) {
			System.out.print(itValues.next()+", ");
		}
	}
}