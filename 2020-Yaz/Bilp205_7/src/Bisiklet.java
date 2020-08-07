
public class Bisiklet extends Tasit{
	
	
	public int vitesSayisi;
	
	public Bisiklet(int yas, String reng,int vitesSayisi) {
		super(yas, reng);
		this.vitesSayisi=vitesSayisi;
		// TODO Auto-generated constructor stub
	}

	
	

	@Override
	public int fintfiyatHesapla() {
		
		int fiyat=2000;
		if(vitesSayisi>=18)
			
			fiyat+=500;
		fiyat=fiyat-yas*100;
		
		return fiyat;
	}

}
