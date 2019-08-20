package hakan;

public class Methods {

	public static void selamlama() {
		System.out.println("Nasýlsýnýz, her sey yolunda mý ?");
	    System.out.println("Çok iyi görünmüyorsunuz");
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
