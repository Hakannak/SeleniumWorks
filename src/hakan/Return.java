package hakan;

public class Return {
	public static int toplama(int a, int b, int c) {
		return (a + b + c);

	}
   public static int uclecarp(int a) {
	   return a*3;
	   
   }
	public static int ikiyletopla(int a) {
		return a+2;
	}
   public static int besc�kar(int a) {
	   return a-5;
   }
	public static void main(String[] args) {

		System.out.println("Toplam : " + toplama(3, 54, 756));
		toplama(23, 123, 5423); //
	    
		System.out.println("Sonu� : "+ besc�kar(ikiyletopla(uclecarp(56))));
	
	}

}
