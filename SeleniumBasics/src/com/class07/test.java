package com.class07;

import com.class06.CommonMethods;

public class test extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
		CommonMethods.setUpDriver("chrome", "http://google.com");
		driver.close();
	}

}
