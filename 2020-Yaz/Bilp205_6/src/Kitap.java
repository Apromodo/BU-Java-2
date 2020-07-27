
public class Kitap extends Yayin {

	
	public boolean CiltliMi;
	
	
	
	public Kitap(String yayinAdi, int sayfaSayisi, int yayinYili, String[] yazarlar,boolean ciltliMi) {
		super(yayinAdi, sayfaSayisi, yayinYili, yazarlar);
		this.CiltliMi=ciltliMi;
		
	}

	
	
}
