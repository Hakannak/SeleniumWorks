package hakan;

public class Methods {

	public static void selamlama() {
		System.out.println("Nas�ls�n�z, her sey yolunda m� ?");
	    System.out.println("�ok iyi g�r�nm�yorsunuz");
	}
	public static void toplama() {
		int [] array= {23,454,76,234,7};
		int toplam=0;
		for(int a : array) {
			toplam=toplam+a;
			
		}
		System.out.println(toplam);
	}
	public static void main(String[] args) {
	 
		selamlama();
        selamlama();
	    toplama();
	}

}
