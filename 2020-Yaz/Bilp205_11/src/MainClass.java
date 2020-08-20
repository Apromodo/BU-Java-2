import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		ArrayList<String> liste1=new ArrayList<String>();
		
		liste1.add("kars");
		liste1.add("zonguldak");
		liste1.add("muş");
		liste1.add("muğla");
		liste1.add("mersin");
		liste1.add("ankara");
		
		
		System.out.println("sıralamadan önce");
		System.out.println(liste1);
		
		Collections.sort(liste1,new StringKarsilastiricim());
		
//		Collections.sort(liste1,Collections.reverseOrder());
		
		System.out.println("sıraladıktan sonra");
		System.out.println(liste1);


		

	}

}
