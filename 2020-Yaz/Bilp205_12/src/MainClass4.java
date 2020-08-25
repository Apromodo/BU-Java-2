import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		
		//size(), put(key,value)  get(key)  keyset(),  constainskey
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		
		map.put("Lipton", 22);
		map.put("kutu kola", 14);
		map.put("kola 1Lt", 25);
		
		System.out.println("eklemek istediğiniz ürün adı ve adet ini giriniz");
		String urunAdi=sc.nextLine();
		int eklenecekAdet=sc.nextInt();
		
		//önce girilen anhatar hashmap in anahtar kümseinde varmı diye kontrol etmeliyiz
		
		if (map.containsKey(urunAdi)) 
		{
			int mevcut=map.get(urunAdi);
			int yeniDeger=mevcut+eklenecekAdet;
			map.put(urunAdi, yeniDeger);
		}
		else {
			System.out.println("girilen ürün daha önce stokta yok, stoğa ilk kez ekleniyor");
			map.put(urunAdi, eklenecekAdet);
		}
		
		for (String urun:map.keySet())
			System.out.println(urun+" ürününden "+map.get(urun)+" adet var");
	}

}
