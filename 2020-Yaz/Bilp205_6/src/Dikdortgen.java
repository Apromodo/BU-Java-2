
public class Dikdortgen extends Sekil {
	
	private double en;
	private double boy;
	
	
	
	
	public Dikdortgen(double en, double boy) {
		super();
		this.en = en;
		this.boy = boy;
	}




	@Override
	public double alanHesapla() {
	
	
		return en*boy;
	}




	@Override
	public double cevreHesapla() {
		
		return 2*(en+boy);
	}




	@Override
	public void yaz() {
		// TODO Auto-generated method stub
		
	}
	
	

}
