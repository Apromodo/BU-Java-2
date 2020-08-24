import java.util.ArrayList;
import java.util.Collections;

public class selectionshort10k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ArrayList<Integer> liste=new ArrayList<Integer>();
	        
			
			for(int sayilar=100000;sayilar>=0;sayilar--)
				liste.add(sayilar);
			
			yazdir(liste);
			
			for (int sayac=0;sayac<liste.size()-1;sayac++) {
				
				int min_index=sayac;
				
				for (int j=sayac;j<liste.size();j++)
					
					if(liste.get(j)<liste.get(min_index))
						min_index=j;
				
				
				int enKucuk =liste.get(min_index);
				liste.set(min_index, liste.get(sayac));
				liste.set(sayac, enKucuk);
				
				yazdir(liste);
			}
			
			long baslangic = System.currentTimeMillis();
			long bitis = System.currentTimeMillis();
			
			System.out.println("Hesaplanan Süre: "+(bitis-baslangic)+" ms.");
			
			
			

	}
	
	public static void yazdir(ArrayList<Integer> sayilar) {
		for (Integer n:sayilar)
			System.out.println(n);
	}
	

}