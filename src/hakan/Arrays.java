package hakan;

public class Arrays {

	public static void main(String[] args) {
		 int[] years = new int[11];

			for (int i = 0; i <=years.length-1; i++) {

				years[i] = 2010 + i;
			}
			
			
			for (int i = 0; i <years.length; i++) {

				System.out.println(years[i]);
			}

	}

}
