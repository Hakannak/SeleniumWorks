package com.c1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scan;

		String reversed = "";

		String word;

		scan = new Scanner(System.in);

		System.out.println("Please enter any word");

		word = scan.nextLine();

		for (int i = word.length()- 1; i >= 0; i--) {

			reversed = reversed + word.charAt(i);

		}

		if(word.equals(reversed)) {
			
			System.out.println("This word is palindrome");
		}else {
			
			System.out.println("This word is not palindrome");
		}

	}

}
