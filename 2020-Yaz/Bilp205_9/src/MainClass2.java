import java.util.ArrayList;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList liste=new ArrayList();
		
		liste.add(5);               //liste.add(5);     Integer --> int için sarmalıyıcı sınıf
		liste.add("ahmet");
		liste.add(new Araba());
		Araba araba=new Araba();
		liste.add(araba);
		String str="ahmet";
		liste.add(str);
		liste.add(5.5);             // double için sarmalıyıcı sınıf
		
		
		
		liste.remove(2);            //kaldırma/silme işlemleri için
		
		
		System.out.println("Listenin boyutu liste.size "+liste.size());
		for (int i=0;i<liste.size();i++)
			System.out.println(liste.get(i));
		
		
		
		for(Object eleman:liste)
			System.out.println(eleman);
		
		
		//listeye liste.add ile eleman eklenir size() metodu ile listenin boyutunu döndürür
		//get() metodu belirtilen elemanı döndğrür
		
		//dizilerin boyutu sabit; dizilerin boyutu küçültemez, büyültemez
		//int [] dizi=new int[5]; int[] dizi2=new int[5];
		
		
		

	}

}
