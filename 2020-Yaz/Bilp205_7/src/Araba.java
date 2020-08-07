
public class Araba extends Tasit{
	
	
	public boolean elektirikliMi;
	

	public Araba(int yas, String reng, boolean elektirikliMi) {
		super(yas, reng);
		this.elektirikliMi=elektirikliMi;
	}

	@Override
	public int fintfiyatHesapla() {
		
		int fiyat = 200000;
		if(elektirikliMi)
			fiyat+=50000;
		
		fiyat=fiyat-yas*10000;
		return fiyat;
	}

}
