package com.class02;

import org.testng.annotations.Test;

public class priorty {

	@Test(priority = 0)
	
	public void first() {
		
		System.out.println("First test case annotation");
	
	}
   
    @Test(priority = 1)
	
	public void second() {
		
		System.out.println("Second test case annotation");

    }

   @Test(priority = 2)
	
	public void third() {
		
		System.out.println("Third test case annotation");
   }
}
