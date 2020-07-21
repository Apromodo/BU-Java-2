
public class Oyuncu {

	
	
	private static int oyuncuSayisi;
	//ENCAPCULATİON
	
	private int id;
	
	
	
	public Oyuncu() {
		oyuncuSayisi++;
		this.id=oyuncuSayisi;
	}

	public int getOyuncuSayisi() {
		return oyuncuSayisi;
	}

	public int getId() {
		return id;
	}
	
}
