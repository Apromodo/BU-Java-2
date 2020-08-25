import java.util.HashMap;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> noIsimMap=new HashMap<Integer, String>();       //<anahtar,değer>     <key, value>
		
		noIsimMap.put(28, "Volkan");
		noIsimMap.put(85, "Esra");
		noIsimMap.put(33, "Kemal");
		
		
		for (int no:noIsimMap.keySet())
			System.out.println(no+" Numaranın sahibi "+noIsimMap.get(no));
		
		
	}

}
