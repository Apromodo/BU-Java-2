
public class Film implements Comparable <Film>{

	
	private String ad;
	private int yil;
	private int sure;
	private double ortalamaPuan;
	
	
	public Film(String ad, int yil, int sure, double ortalamaPuan) {
		super();
		this.ad = ad;
		this.yil = yil;
		this.sure = sure;
		this.ortalamaPuan = ortalamaPuan;
	}


	@Override
	public int compareTo(Film digerFilm) {
		
		if (this.yil<digerFilm.yil)
			return -1;
		
		else if (this.yil>digerFilm.yil)
			return 1;
		
		else
		{
//			Filmin yılları aynı ise 
			
			if (this.sure<digerFilm.sure)
				return -1;
			
			else if (this.sure>digerFilm.sure)
				return 1;
			
			else
				return 0;
		}
	}


	@Override
	public String toString() {
		return "Film ad=" + ad + ", yil=" + yil + ", sure=" + sure + ", ortalamaPuan=" + ortalamaPuan;
	}

	
	
	
	
}
