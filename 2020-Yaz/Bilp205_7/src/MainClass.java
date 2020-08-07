
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Kamera kamera=new Kamera(2010);
		
		kamera.baslat();
		kamera.kapat();
		kamera.modelBilgi();
		
		
		Araba araba=new Araba(2010, "beyaz",true);
		Bisiklet bisiklet=new Bisiklet(10,"kirmizi",12);
	
		
		*/
		
		
		Daire d=new Daire(5);
		Dikdortgen dik=new Dikdortgen(3,5);
		
		System.out.println(d.alanHesapla());
		System.out.println(d.cevreHesapla());
		
		System.out.println(dik.alanHesapla());
		System.out.println(dik.cevreHesapla());
		
		
		test(d);
		test(dik);
		
		
	}
	
	
	public static void test(Sekil sekil) {
		
		sekil.alanHesapla();
		sekil.cevreHesapla();
	}
	
	
	/*
	
	public static void Dairetest(Daire d) {
		
		System.out.println(d.alanHesapla());
		System.out.println(d.cevreHesapla());
		
	}
	
	public static void dikdortgenTest(Dikdortgen dik) {
		
		System.out.println(dik.alanHesapla());
		System.out.println(dik.cevreHesapla());
		
	}
	
	*/

}
