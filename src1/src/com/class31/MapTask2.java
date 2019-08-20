package com.class31;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTask2 {

	public static void main(String[] args) {
		
		Map<Integer,String>floor=new HashMap<>();
		floor.put(1, "Syntax");
		floor.put(2, "Amazon");
		floor.put(3, "Airbn");
		floor.put(4, "Google");
		floor.put(5, "Tesla");
		floor.put(6, "Apple");
		floor.put(7, "SpaceX");
		
		System.out.println(floor);
		
		System.out.println(floor.size());
		
		floor.replace(4, "microsoft");
		
		System.out.println(floor);
		
		floor.remove(7, "SpaceX");
		
		System.out.println(floor);
		
		Set <Integer> keys=floor.keySet();
		
		for(Integer key : keys) {
			
			System.out.println(key+".floor "+floor.get(key));
		}
	}

}
