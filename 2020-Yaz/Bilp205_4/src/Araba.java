
public class Araba {

	
	public int model;
	public String marka;
	public String renk;
	


	public Araba(int model, String marka, String renk) {
		super();
		this.model = model;
		this.marka = marka;
		this.renk = renk;
	}
	
	
	public  void yazdir() {
		
		System.out.println("Model: "+model);
		System.out.println("Marka: "+marka);
		System.out.println("renk: "+renk);
		
	}
	
	
}
