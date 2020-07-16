
public class Zaman {

	
	private int saat;
	private int dakika;
	private int saniye;
	
	
	public Zaman() {
		System.out.println("yapılandırıcı çalıştı");
		System.out.println("Bir zaman nesenesi oluşturuldu");
	}
	
	
	//CONSTRUCTER OVERLOADİNG
	public Zaman(int saat, int dakika, int saniye) {
		
		if(saat<0 || saat>24)
			this.saat=saat;
		else
		
		
		this.saat = saat;
		this.dakika = dakika;
		this.saniye = saniye;
	}

	public void ayarla(int saniye,int dakika,int saat) {
		this.saniye=saniye;
		this.dakika=dakika;
		this.saat=saat;
		
	}
	
	public void yazdir() {
		System.out.println("saat: "+saat + " dakika: " + dakika + " saniye: " + saniye);
	}
	
	public void birsaniyearttir() {
		saniye = saniye + 1;
		
		if(saniye==60)
		{
			dakika++;
			saniye=0;
		}
	}
	
	public void birdakikaarttir() {
		saniye = saniye + 1;
		
		if(saniye==60)
		{
			dakika++;
			saniye=0;
		}
	}
	
	
	
}
