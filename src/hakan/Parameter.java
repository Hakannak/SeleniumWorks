package hakan;

public class Parameter {
   
	
    public static void main(String[] args) {
		
      selamlama("ismail abi");
	  selamlama("Kapcýk mehmet");
	  toplama(123,43,65);
    }
    public static void selamlama(String isim) {
    	System.out.println("Naber " +isim);
    }
	public static void toplama(int a,int b,int c) {
		System.out.println("Toplam : "+ (a+b+c));

}
}