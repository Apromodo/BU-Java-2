
public class Daire extends Sekil{

	
	private double yaricap;
	
	public Daire(double yaricap) {
		super();
		this.yaricap=yaricap;
	}
	
	
	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return Math.PI*yaricap*yaricap;
	}

	@Override
	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return 2*Math.PI*yaricap;
	}

}
