package com.class28;

import java.util.ArrayList;

public class Names {

	public static void main(String[] args) {

		ArrayList<String> namess = new ArrayList<String>();

		namess.add("Hakan");
		namess.add("Alperen");
		namess.add("Emin");
		namess.add("Hasan");
		namess.add("Cihan");

		System.out.println(namess.isEmpty());
		System.out.println(namess.contains("hakan"));
		System.out.println(namess.size());
	
		for(String get:namess) {
			System.out.println(get);
		}
		
	}

}
