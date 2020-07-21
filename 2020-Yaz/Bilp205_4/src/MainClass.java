
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Nokta nokta1=new Nokta(3,4);
		double orjineUzaklik=nokta1.uzaklikBul();
		System.out.println(orjineUzaklik);
		
		Nokta nokta2=new Nokta(9,12);
		double n1n2Uzaklik=nokta1.uzaklikBul(nokta2);
		System.out.println(n1n2Uzaklik);
		
		
		
	}

}
