
public class Ev {

	public int yuzolcum;
	public int odaSayisi;
	
	public Ev(int yuzolcumu,int odaSayisi) {
		this.yuzolcum=yuzolcumu;
		this.odaSayisi=odaSayisi;
		
	}
//	MİRAS NEDR NASIL KULLANILIR 
	@Override
	public String toString() {
		return "ev in yuzolcum: "+yuzolcum+" odasayısı: "+odaSayisi;
		
	}
	
	public double fiyatHesapla(int m2Fiyati) {
		return yuzolcum*m2Fiyati;
		
	}
	
}
