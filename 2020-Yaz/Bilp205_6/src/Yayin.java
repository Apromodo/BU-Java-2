import java.util.Arrays;

public abstract class Yayin {

	
	
	public String yayinAdi;
	public int sayfaSayisi;
	public int yayinYili;
	public String[] yazarlar;
	
	
	
	
	
	public Yayin(String yayinAdi, int sayfaSayisi, int yayinYili, String[] yazarlar) {
		super();
		this.yayinAdi = yayinAdi;
		this.sayfaSayisi = sayfaSayisi;
		this.yayinYili = yayinYili;
		this.yazarlar = yazarlar;
	}





	@Override
	public String toString() {
		return "Yayin [yayinAdi=" + yayinAdi + ", sayfaSayisi=" + sayfaSayisi + ", yayinYili=" + yayinYili
				+ ", yazarlar=" + Arrays.toString(yazarlar) + "]";
	}
	
	
	
	
}
