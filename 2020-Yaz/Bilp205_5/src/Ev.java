
public class Ev {

	
	public int odaSayisi;
	public int yuzOlcum;
	
	
	
	public Ev(int odaSayisi, int yuzOlcum) {
		super();
		this.odaSayisi = odaSayisi;
		this.yuzOlcum = yuzOlcum;
	}
	
	
	public int fiyatHesapla(int m2ArsaFiyati, int odaFiyat) {
		return yuzOlcum*m2ArsaFiyati+odaSayisi*odaFiyat;
		
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "evin doda saysısı:"+odaSayisi+" yüzölcümü: "+yuzOlcum+" metrekaredir";
	}
	
	
	
}
