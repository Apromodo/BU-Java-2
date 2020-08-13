import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		ArrayList<String> isimler=new ArrayList<String>();
		//type safe için
		
		isimler.add("Ahmet");
		isimler.add("Mehmet");
		isimler.add("İsmail");
		
		
		System.out.println(isimler.get(1).substring(0,2));
		
		for(String isim:isimler)
			System.out.println(isim.equals("ali"));
		
		
		
		ArrayList<Integer> sayilar=new ArrayList<Integer>();
		
		
		int b=6;
		
		int sonuc=Integer.parseInt("123");
		sayilar.add(b);
		sayilar.add(5);
		sayilar.add(8);
		
		
//		for(int sayi:sayilar)
//			System.out.println(sayi);
		
		*/
		ArrayList<Double> yagislar = new ArrayList<Double>();
		yagislar.add(55.2);
		yagislar.add(53.2);
		yagislar.add(44.24);
		
		
		yagislar.set(1, 63.78);
//		yagislar.remove(0); belirli bir değeri silmek için
//		yagislar.clear(); hepsini silmek için
		
		for(Double yagis:yagislar)
			System.out.println(yagislar);
		
		
	}

}
