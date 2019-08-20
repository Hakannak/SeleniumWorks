package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int a = 1; a < 51; a++) {

			if (a % 2 != 0) {

				numbers.add(a);
			}
		}
		System.out.println(numbers);

		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			int number=it.next();
			if(number%5==0) {
				it.remove();
			}
		}
	System.out.println(numbers);
	}

}
