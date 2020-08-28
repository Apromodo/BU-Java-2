
public class Monitor {

	public double boyut;
	public int dpi;

	public Monitor(double boyut, int dpi) {
		this.boyut = boyut;
		this.dpi = dpi;
	}

	public boolean equals(Monitor m2) {

		if (this.boyut == m2.boyut && this.dpi == m2.dpi)
			return true;
		else
			return false;
	}
}
