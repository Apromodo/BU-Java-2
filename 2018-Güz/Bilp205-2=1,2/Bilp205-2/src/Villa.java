
public class Villa extends Ev {

	public boolean havuz;
	
	public Villa(int yuzolcum,int odaSayisi,boolean havuz) {
		super(yuzolcum,odaSayisi);
		this.havuz=havuz;
		
		
	}
//	Ev sınıfının toString() metodunu örtme (override)
	public String toString() {
		
		
		String havuzVarmi="YOK";
		if(havuz)
			havuzVarmi="Var";
		
		
//		return "Villanın yuzolcumu: "+yuzolcum+" Odasayısı: "+odaSayisi+" Havuz: "+havuzVarmi;
		
		return super.toString()+" havuz "+havuzVarmi;

	}
	 public double fiyatHesapla(int m2Fiyati) {
		 double fiyat=yuzolcum*m2Fiyati;
		 if(havuz)
			 fiyat=fiyat+50000;
		 return fiyat;
	 }
	
}
