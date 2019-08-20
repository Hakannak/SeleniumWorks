package hakan;

import java.util.Scanner;

public class Task {

	

	public static void main(String[] args) {
		Task hey=new Task();
		hey.number();
		hey.pal();
	}
	void pal(){
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please enter a string");
		String b=scan1.nextLine();
		String reverse="";
		for(int c=b.length()-1;c>=0;c--) {
		reverse+=b.charAt(c);
		}
		if(reverse.equals(b)) {
			System.out.println("This is palindrom");
		}else {
			System.out.println("This is not palindrom");
		}
	}
	
	void number() {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number");
		int a=scan.nextInt();
		if(a%2!=0) {
			System.out.println("Number is odd");
		}else {
			System.out.println("Number is even");
		}
				
	
	}
}
