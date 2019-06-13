
public class Bilp205_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dikdortgen d1=new Dikdortgen(3,5);
		d1.alanBul();
		d1.cevreBul();
		
		Ucgen u1=new Ucgen(4,6,8,10);
		u1.alanBul();
		u1.cevreBul();
		
		
		ucgenYazdir(u1);
		dikdortgenYazdir(d1);
		
		//yazdir(d1);
		//yazdir(u1);
	
	}
	
	public static void ucgenYazdir(Ucgen ucgen) {
		System.out.println("alani "+ucgen.alan+" cevresi "+ucgen.cevre);
	}
	public static void dikdortgenYazdir(Dikdortgen dikdortgen) {
		System.out.println("alani "+dikdortgen.alan+" cevre "+dikdortgen.cevre);
	}

}
