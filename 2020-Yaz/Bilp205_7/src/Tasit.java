
public abstract class Tasit {

	public int yas;
	public String reng;
	
	
	
	public Tasit(int yas, String reng) {
		super();
		this.yas = yas;
		this.reng = reng;
	}
	
	
	public abstract int fintfiyatHesapla();
	
	public void yasBilgi() {
		System.out.println("taşıtın yaşı: "+yas);
		
	}
	
}
