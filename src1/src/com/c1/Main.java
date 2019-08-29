package com.c1;

import java.util.Scanner;

class Main {
    
	Scanner scan;
	
	String make,colour,type;
	
	int model,door;
	
	
	public static void main(String[] args) {
		
		Main obj=new Main();

		obj.make="Honda";
		
		obj.colour="black";
		
		obj.type="Civic";
		
		obj.model=2009;
		
		obj.door=4;
		
		System.out.println("My car is "+obj.make+" "+obj.type+" and it is "+obj.model+" model ");
       
		obj.sum();
		
		obj.sub(134, 41);
		
		System.out.println(obj.mult(123, 323, 1230));
		
		System.out.println(obj.div());
	
		
	
	
	}

	   void sum() {
		
		int a=231412;
		
		int b=23123;
		
		System.out.println(a+b);
		
	}
	
	public void sub(int a, int b) {
		
		System.out.println(a-b);
	}
	
	protected int mult(int a, int b , int c) {
		
		return a*b*c;
	}

   
	public int div() {
		
		int num1=2345;

		int num2=15;
		
		return num1/num2;
	}

  
	public void largest() {
		
		int lar;
		
		int [] ar= {123,33,67,96,0,-1};
		
		lar=ar[0];
		
		for(int array : ar) {
			
			if(array>lar) {
				
				array=lar;
			}
		
		}
		System.out.println(lar);
	}
   
	
		
		
	public void getGrade(int score) {		
	     
		char grade;
		
	   if(score>=90) {
		   grade='A';
	   }else if(score>=80 && score<90){
		   grade='B';
	}else if(score>=70 && score<80) {
		   grade='C';
	}else if(score>=50 && score<70) {
		    grade='D';
	}else {
		    grade='F';
	}
		
	System.out.println(grade);
}

	public void pal() {
		
		String word;
		
		String reversed="";
		
		scan=new Scanner(System.in);
		
		do {
		
			System.out.println("Please enter any word");
			
			word=scan.nextLine();
			
			for(int i=word.length()-1 ; i>=0 ; i--) {
				
				reversed=reversed+word.charAt(i);
			}
		  
			
		 }while(!word.equals(reversed));
		
		   
		    System.out.println("Yess!!! This word is palindrome");
		
	
	}

	}
