
public class MainClass {

	public static void main(String[] args) {
	
		int yazili1 = 40;
		int yazili2 = 50;
		int yazili3 = 90;
		int yazili4 = 100;
		
		System.out.println("-------------- Not Ortalamaları --------------");
		double ilkIkiOrtalama = Hesaplayici.ortalamaBul(yazili1, yazili2);
		System.out.println("İlk iki ortalama: " + ilkIkiOrtalama);
		
		double ilkUcOrtalama = Hesaplayici.ortalamaBul(yazili1, yazili2,yazili3);
		System.out.println("İlk üç ortalama: " + ilkUcOrtalama);
		
		double genelOrtalama = Hesaplayici.ortalamaBul(yazili1, yazili2,yazili3,yazili4);
		System.out.println("Genel ortalama: " + genelOrtalama);
		System.out.println("----------------------------------------------");
	}

}
