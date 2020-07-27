
public class Daire extends Sekil{

	
	private double yaricap;
	
	
	

	public Daire(double yaricap) {
		super();
		this.yaricap = yaricap;
	}

	@Override
	public double alanHesapla() {
		
		return Math.PI*yaricap*yaricap;
	}

	@Override
	public double cevreHesapla() {
	
		
		return 2*Math.PI*yaricap;
	}

	@Override
	public void yaz() {
		
		System.out.println("Daire");
		
	}
	
}
