package hakan;

import java.util.Scanner;

public class Banana {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        Apple AppleObject=new Apple();
        System.out.println("Please enter your name here:");
        String key=scan.nextLine();
        AppleObject.simpleAction(key);
        	
        //That code is executing another class 
	}

}
