package com.class03;

import org.testng.annotations.Test;

public class DependsOnGroups {
	
	@Test(groups ="Smok1")
	public void one() {
		System.out.println("one test ");
	}
	
	@Test(groups ="Smok2",dependsOnGroups ="Smok1")
	public void two() {
		System.out.println("two test ");
	}
	
	@Test(groups ="Smok3",dependsOnGroups ="Smok2")
	public void three() {
		System.out.println("three test ");
	}

}