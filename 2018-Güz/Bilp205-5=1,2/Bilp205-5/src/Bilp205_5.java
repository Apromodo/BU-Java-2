import java.util.ArrayList;
import java.util.Collections;

public class Bilp205_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
        //		GENERİCS
		list.add("günaydın");
		list.add("good morning");
		list.add("bonjour");
		System.out.println("1. elemanın uzunlugu "+list.get(1).length());
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(6);
		list2.add(9);
		list2.add(3);
		list2.add(5);
		Collections.sort(list2); //küçükten büye sıralama
		
		for (int i=0;i<list2.size();i++)
			System.out.println(list2.get(i));
		
		for (Integer sayi:list2)
			System.out.println(sayi);
		
		for (String str:list)
			System.out.println(str);
		
		Collections.sort(list); //alfabetik büye dogru sıralama
		for (String str:list)
			System.out.println(str);
		
		Personel p1=new Personel(9620,26);
		Personel p2=new Personel(366,58);
		
		System.out.println(p1.equals(p2));
		
		Monitor m1=new Monitor(17,24);
		Monitor m2=new Monitor(14,32);
		Monitor m3=new Monitor(17,24);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m2.equals(m3));
		
/*
		int[] dizi = new int[5];
		dizi[0] = 5;
		dizi[1] = 7;
		int[] dizi2 = new int[] { 5, 4, 3, 8 };

		System.out.println(dizi[2]);
		ArrayList list = new ArrayList();

		// COLECTİONS framework
		// int double char
		// arraylist primitif data tipi şeklinde saklanmaz
		// sarmaliyici sınıf kullanılır(int yerine intieger,double Double,charDouble,gibi)
		
		Integer a = Integer.parseInt("5");
		Double b = Double.parseDouble("3.14");
		// sarmalıyıcı sınıfların da metodları vardır

		list.add(5);
		list.add("Kemal");
		list.add(3.1415);
		list.add(new Personel(324,22));
		
		// GENERİCS
		String str = (String) list.get(1); // String dizi=new String[6]; String str=dizi[1];
		System.out.println("Stringin uzunlugu: "+str.length()); //Donusum Casting
		Personel p1=(Personel)list.get(3);
		System.out.println(p1); //sysout(p1.toString);
		
		*/
		
		

	}

}
