import java.util.ArrayList;
import java.util.Collections;

public class bubbleshort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<Integer> liste=new ArrayList<Integer>();
        
		
		for(int sayilar=100000;sayilar>=0;sayilar--)
			liste.add(sayilar);
		
		
		for (int i=0;i<liste.size()-1;i++) {
			
			for(int j=1;j<liste.size()-i;j++) {
				
				if(liste.get(j-1)>liste.get(j)) {
					int gecici=liste.get(j);
					liste.set(j,liste.get(j-1));
					liste.set(j-1,gecici);
				}
				yazdir(liste);
			}
			System.out.println((i+1)+"asdasd");
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
