
public class Dikdortgen extends Sekil{

	private double en;
	private double boy;
	
	
	public Dikdortgen(int en, int boy) {
		super();
		this.en=en;
		this.boy=boy;
	}
	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return en*boy;
	}
	@Override
	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return 2*(en+boy);
	}
	
	
	public void dikdortgenOzelMetot() {
		System.out.println("dikdörtgene sınıfına özgündür");
	}
	
	
}
