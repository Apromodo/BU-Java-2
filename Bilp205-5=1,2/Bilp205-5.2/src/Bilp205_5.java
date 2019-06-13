import java.util.HashMap;

public class Bilp205_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("turkiye", "ankara");
		map.put("almanya", "berlin");
		map.put("fransa", "paris");
		map.put("ingiltere", "londra");

		for (String ulke : map.keySet())

			System.out.println("ulke " + ulke + " baskent " + map.get(ulke));

		HashMap<Integer, Integer> s1 = new HashMap<Integer, Integer>();

		s1.put(0, 4);
		s1.put(1, 5);
		s1.put(2, 6);
		s1.put(3, 7);
		s1.put(4, 8);
		s1.put(5, 9);
		s1.put(6, 0);
		s1.put(7, 1);
		s1.put(8, 2);
		s1.put(9, 3);

		int[] orjinal = new int[] { 9, 4, 6, 5, 3 };
		int[] sifreli = sifrele(s1, orjinal);
		
		for(int n:sifreli)
			System.out.println(n+" ");
		
		int[] cozulmus=coz(s1,sifreli);
		
		

	}

	private static int[] coz(HashMap<Integer, Integer> s1, int[] sifreli) {
		int[] cozulmus=new int[sifreli.length];
		
		
		return cozulmus;
	}
	
	

	private static int[] sifrele(HashMap<Integer, Integer> s1, int[] orjinal) {

		int[] sifreli = new int[orjinal.length];

		for(int i=0;i<orjinal.length;i++) {
			
			sifreli[i]=s1.get(orjinal[i]);
		}
		return sifreli;

	}
}
