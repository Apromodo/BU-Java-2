import java.util.HashMap;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> sifre=new HashMap<String,String>();
		
		sifre.put("A","E");
		sifre.put("B","F");
		sifre.put("C","G");
		sifre.put("D","H");
		sifre.put("E","I");
		sifre.put("F","J");
		sifre.put("G","K");
		sifre.put("H","L");
		
		String orjinal="BABA";
		String sifreliMesaj="";
		for(int i=0;i<orjinal.length();i++) {
			String harf=orjinal.substring(i,i+1);
			sifreliMesaj+=sifre.get(harf);
		}
		    System.out.println("orjinal mesaj "+orjinal);
			System.out.println("sifreli mesaj "+sifreliMesaj);
	}

}
