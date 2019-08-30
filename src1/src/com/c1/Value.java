package com.c1;

public class Value {

	
		
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

}
