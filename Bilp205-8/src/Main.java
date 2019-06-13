import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> noisim = new HashMap<Integer, String>();
//		put metodu
		noisim.put(70, "Datome");
		noisim.put(26, "Sloukas");
		noisim.put(10, "Dixon");
		noisim.put(34, "Vessely");
		noisim.put(33, "Melli");

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("bir numara giriniz");
		int no = scanner.nextInt();
//		contains metodu verilen anahtar keySet içinde varsa true döndürür
		if (noisim.containsKey(no)) // if(noisim.get(no)==null)
			System.out.println(no + " numarasının sahibi: " + noisim.get(no));
		else
			System.out.println("böyle bir numara yok. ");
		
		noisim.remove(33); //remove metodu ile verilen anhtar ile eleman çıkarılır
		noisim.replace(33,"Melih");
		
		System.out.println("mapin son hali");
		
		for(Integer anahtar:noisim.keySet()) //.keyset anahtar değerleri dizisi
			System.out.println(anahtar+" numarasının sahibi "+noisim.get(anahtar));
			
		
		scanner.close();
	}

}
