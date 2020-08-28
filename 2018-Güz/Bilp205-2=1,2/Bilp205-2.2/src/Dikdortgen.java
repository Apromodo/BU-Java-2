
public class Dikdortgen extends Sekil{

	private double en,boy;
	
	public Dikdortgen(double en,double boy) {
		this.en=en;
		this.boy=boy;
		
	}
	
	public void alanBul() {
		alan=en*boy;
	}
	public void cevreBul() {
		cevre=2*(en+boy);
		
	}
}
