package com.class32;

import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		
		 Map<Integer,Person>person=new HashMap();
		 person.put(1, new Person("Hakan","Ak",25,45000));
		 person.put(2, new Person("Alperen","Ak",20,55000));
		 person.put(3, new Person("Sezai","Ak",55,65000));
		 person.put(4, new Person("Nuray","Ak",45,35000));
		 
		 Collection<Person> allValues=person.values();
			for(Person per:allValues) {
				per.getUserDetail(); 
			}
	
	
	}

}
