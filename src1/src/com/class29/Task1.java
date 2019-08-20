package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String>car=new ArrayList<String>();
		
		car.add("toyota");
		car.add("honda");
		car.add("bmw");
		car.add("mercedes");
		car.add("ford");
		
		System.out.println(car);
		
		
		System.out.println("-------- 2. way--------------");
		
		for(int a=0;a<car.size();a++) {
		   
			System.out.println(car.get(a));
		}
		
		System.out.println("----------3. way ------------");
		
		for(Object b : car) {
			System.out.println(b);
		}
		
		System.out.println("-------------4. way---------------");
		Iterator<String> it = car.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	

}
