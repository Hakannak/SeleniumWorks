package com.class28;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(33);
		numbers.add(100);

		numbers.set(2, 3333);

		for (Integer num : numbers) {
			System.out.println(num);
		}

	}
}