public class Uniogrenci extends Ogrenci{

	public String bolum;
	
	public Uniogrenci(String adSoyad,int numara){
		
		super(adSoyad,numara);
		this.bolum=bolum;
	}
	public void Ogrencig(){
		System.out.println(adSoyad+" "+numara+" "+bolum);
		
	}
	
}