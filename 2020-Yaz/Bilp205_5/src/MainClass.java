
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Ev ev=new Ev(4,120);
		System.out.println("evin fiyatı: "+ev.fiyatHesapla(1000, 10000));
		
		
		Villa villa=new Villa(4,120,true);
		System.out.println("vilanın fiyatı: "+villa.fiyatHesapla(1000, 10000));
		
		
		System.out.println(ev.toString());
		System.out.println(villa);
		*/
		
		
		Nokta n1=new Nokta(3,5);
		System.out.println(n1);
		
		Nokta n2=new Nokta(3,5);
		System.out.println(n2);
		
		
		if(n1.equals(n2)) {
			System.out.println("Noktalar eşit");
		}
		else
			System.out.println("eşit değil");
	}

}
