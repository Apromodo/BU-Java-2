
public class Ucgen extends Sekil{

	private double  taban,yukseklik,kenar1,kenar2;
	
	public Ucgen(double taban,double yukseklik,double kenar1,double kenar2) {
		this.taban=taban;
		this.yukseklik=yukseklik;
		
	}

	@Override
	public void alanBul() {
		taban=100;
		alan=taban*yukseklik/2;
		
	}

	@Override
	public void cevreBul() {
	
		cevre=taban+kenar2+kenar1;
		
	}
	
	
}
