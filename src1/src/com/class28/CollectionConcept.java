package com.class28;

public class CollectionConcept {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		int[] array= {10,20,30,40};
		
		int[] intArray=new int[3];
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		
		//intArray[3]=40;
		
		int num=intArray[2];
		System.out.println(num);
		
		for(int i=0; i<intArray.length;i++) {
			System.out.println(intArray[i]);
			
		}
    
		for(int number: intArray) {
			System.out.println(number);
		}
	}

}
