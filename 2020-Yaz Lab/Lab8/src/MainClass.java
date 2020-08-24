import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> liste=new ArrayList<Integer>();
		
		for(int i=10000;i>=0;i--)
			liste.add(i);
		
		
		long baslangic = System.currentTimeMillis();
		Collections.sort(liste);
		long bitis = System.currentTimeMillis();
		
		System.out.println("Hesaplanan Süre: "+(bitis-baslangic)+" ms.");
		

	}

}
