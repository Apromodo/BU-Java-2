
public class Nokta {

	
	private double x;
	private double y;
	
	
	
	
	
	
	public Nokta(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double uzaklikBul() {
		
		
		double xKare=x*x;
		double yKare=y*y; //Math.pow(y,5);
		double uzaklik = Math.sqrt( (xKare+yKare));
		return uzaklik;
		
	}

	public double uzaklikBul(Nokta digerNokta) {
		

		double xFark=digerNokta.x-this.x;
		double yFark=digerNokta.y-this.y;
		double karalerToplami =xFark*xFark+yFark+yFark;
		double ikiNoktaArasiUzaklik= Math.sqrt(karalerToplami);
		
		return ikiNoktaArasiUzaklik;
	}

	
	
	
	
}
