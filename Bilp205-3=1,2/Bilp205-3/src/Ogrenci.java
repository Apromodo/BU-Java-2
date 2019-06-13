
public class Ogrenci extends Kisi{
	
	public int ogrencino;
	
	public Ogrenci(int tcno,int ogrencino) {
		super(tcno);
		this.ogrencino=ogrencino;
		
	}
	
	public int numaraGetir(int ogrencino) {
		return ogrencino;
		
	}

}
