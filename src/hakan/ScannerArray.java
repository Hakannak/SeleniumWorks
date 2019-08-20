package hakan;
import java.util.Scanner;
public class ScannerArray {

	public static void main(String[] args) {
		 Scanner userInput = new Scanner(System.in);

			String[] arr = new String[7];

			for (int i = 0; i <arr.length; i++) {

				System.out.println("Please enter day " + (i+1) + " of the week");
				arr[i] = userInput.next();
			}
			
			
			for(int i=0; i<=arr.length-1; i++){
				System.out.println(arr[i]);
			}

	}

}
