import java.util.ArrayList;
import java.util.Scanner;

public class Bilp205_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> isimler=new ArrayList<String>();
		
		isimler.add("Datome");
		isimler.add("Salokas");
		isimler.add("Dixon");
		isimler.add("Vessely");
		isimler.add("Melli");
		
		ArrayList<Integer> numaralar=new ArrayList<Integer>();
		
		numaralar.add(70);
		numaralar.add(26);
		numaralar.add(10);
		numaralar.add(34);
		numaralar.add(33);
		
		System.out.println("Numara giriniz! ");
		Scanner scanner=new Scanner(System.in);
		
		int no=scanner.nextInt();
		boolean bulunduMu=false;
		
		for(int i=0;i<numaralar.size();i++) {
		
			/*if(numaralar.get(i)==no) { //no bulundu ise
			System.out.println(no+" numarasının sahibi "+isimler.get(i) );
			break;
		   }
		}
		if(bulunduMu==false)
		*/	System.out.println("girilen no listede yok ");
		
		int index=numaralar.indexOf(no);
		if(index==1)
			System.out.println("girilen no listede yok");
		else
			System.out.println(no+" numaranın sahibi "+isimler.get(index));
		
		System.out.println(index);
		scanner.close();
	}

	}
}
