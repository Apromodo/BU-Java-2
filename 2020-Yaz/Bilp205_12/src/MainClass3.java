import java.util.HashMap;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> takimPuanMap=new HashMap<String,Integer>();
		
		takimPuanMap.put("Fenerbahçe", 55);
		takimPuanMap.put("Galatasaray", 58);
		takimPuanMap.put("Beşiktaş", 65);
		
		//System.out.println(takimPuanMap.keySet());
		
		for (String isim:takimPuanMap.keySet())                 //takimpuanmap hashmap in anahtar kümsesinin (setinin) her
			                                                    //elemanı (anahtarı ) için
			System.out.println(isim+" takim puanı "+takimPuanMap.get(isim));

	}

}
