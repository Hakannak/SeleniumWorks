package com.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValueFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jack");
		names.add("Nick");
		names.add("Sam");

		System.out.println("---1 way using for loop---");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("---2 way using advance for loop---");
		for (Object name : names) {
			System.out.println(name);
		}

		System.out.println("---3 way using iterator---");
		Iterator<String> it = names.iterator();
		// boolean check=it.hasNext();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
