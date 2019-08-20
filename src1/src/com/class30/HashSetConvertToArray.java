package com.class30;

import java.util.HashSet;
import java.util.*;

public class HashSetConvertToArray {

	public static void main(String[] args) {

		Set<String> list = new HashSet<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");

		System.out.print("HashSet contains : " + list);

		String[] array = new String[list.size()];

		list.toArray(array);

		System.out.print("Array elements :");
		for (String temp : array) {
			System.out.print(temp + " ");
		}

	}
}