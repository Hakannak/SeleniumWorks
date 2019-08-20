package com.class31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapFromArray {

    public static void main(String[] args) {
                        // 1        2        3        4        5            6
        String[] names= {"Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny"};
        
        Map<Integer, String> nameMap=new LinkedHashMap<>();
        
        int key=1;
        
        for(String name:names) {
            nameMap.put(key, name);
            key++;
        }
        System.out.println(nameMap);
        
        for(Map.Entry<Integer,String>entry:nameMap.entrySet()) {
    		String mapValue=entry.getKey()+" == "+entry.getValue();
    		System.out.println(mapValue);
    		
    		
    	}
 
        Iterator<Entry<Integer, String>>it=nameMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			String valueFromMap=entry.getKey()+" : "+entry.getValue();
			System.out.println(valueFromMap);
		}
		

    }
}