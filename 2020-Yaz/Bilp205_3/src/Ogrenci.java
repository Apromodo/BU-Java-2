
public class Ogrenci {

	
	private String ad;
	private String soyad;
	private int no;
	private String sehir;
	
	
	
	//CONSTRUCTER OVERLOADİNG
	public Ogrenci(String ad,String soyad,int no) {
		this(ad,soyad,no,"Ankara");
	}

	
	
	
	public Ogrenci(String ad,String soyad,int no,String sehir) {
		this.ad=ad;
		this.soyad=soyad;
		this.no=no;
		this.setSehir(sehir);
	}

	
	
	public void yazdir() {
		
		System.out.println("---------------bilgi-------------");
		System.out.println("adi: "+ad);
		System.out.println("soyadadi: "+soyad);
		System.out.println("no: "+no);
		System.out.println("---------------------------------");
		
		
	}




	public String getSehir() {
		return sehir;
	}




	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
		
	

}
