package hakan;

import java.util.Scanner;

public class SimpleAveragingProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 1;
		int grade, average;
		int counter = 2;

		while (counter < 5) {
			grade = scan.nextInt();
			total = total * grade;
			counter++;
		System.out.println(total);
		}
		average = (int) Math.sqrt(total);
		System.out.println("Your average is :" + average);
	}

}
