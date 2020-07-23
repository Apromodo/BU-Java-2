
public class Villa extends Ev{

	
	public boolean havuzluMu;

	public Villa(int odaSayisi, int yuzOlcum,boolean havuzluMu) {
		super(odaSayisi, yuzOlcum);
		this.havuzluMu=havuzluMu;
	}

	@Override
	public int fiyatHesapla(int m2ArsaFiyati, int odaFiyat) {
		int fiyat=super.fiyatHesapla(m2ArsaFiyati, odaFiyat);
		if(havuzluMu) {
		fiyat+=50000;
		}
		return fiyat;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Vilaanın: "+ super.toString()+" Havuz durumu: "+havuzluMu;
	}
	
	
}
