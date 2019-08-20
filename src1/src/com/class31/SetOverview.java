package com.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {

	public static void main(String[] args) {
		
		Set <String> classDays=new TreeSet<>();
		classDays.add("Tuesday");
		classDays.add("Wednesday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		System.out.println(classDays);
		System.out.println("----------------------");
		for(String days: classDays) {
			System.out.println(days);
		}
		System.out.println("----------------------");
		
		Iterator<String> it=classDays.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}