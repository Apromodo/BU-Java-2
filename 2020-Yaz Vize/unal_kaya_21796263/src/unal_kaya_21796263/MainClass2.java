package unal_kaya_21796263;

public class MainClass2 {
	
	public static void main(String[] args){
	
	Ust ust =new Ust();
	Orta orta=new Orta();
	Alt alt=new Alt();

	
	Ust[] metodDizisi=new Ust[3];
	metodDizisi [0]= ust;
	metodDizisi [1]= orta;
	metodDizisi [2]= alt;
	
	
	for (Ust md:metodDizisi)
	{
		md.metod ();
		System.out.println("-------------");
		
	}
	
	}

}
