import java.util.ArrayList;
import java.util.Collections;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> liste=new ArrayList<Integer>();
		liste.add(3);
		liste.add(9);
		liste.add(5);
		liste.add(4);
		
		System.out.println("sıralamadan önce");
		System.out.println(liste);
		
		Collections.sort(liste, new SayiKarsilastirici());
		
		System.out.println("sıralamadan sonra");
		System.out.println(liste);

		
		
	}

}
