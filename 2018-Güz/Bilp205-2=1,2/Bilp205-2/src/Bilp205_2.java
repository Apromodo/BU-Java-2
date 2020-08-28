
public class Bilp205_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ev ev=new Ev(120,4);
//		String str=ev.toString();
//		System.out.println(str);
		System.out.println(ev);
		System.out.println("evin fiyatı "+ev.fiyatHesapla(10000));
		
		Villa v1=new Villa(250,7,true);
		System.out.println(v1);
		System.out.println("fiyarı "+v1.fiyatHesapla(10000));
	

		Doviz.cevir(12,12);
	}

	
}
