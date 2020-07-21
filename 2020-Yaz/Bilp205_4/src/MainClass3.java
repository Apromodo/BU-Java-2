
public class MainClass3 {

	//INHERITANCE = KALITIM (MİRAS)
	public static void main(String[] args) {
		
		
		Ogrenci o1=new Ogrenci("BAA", 21796263);
		
		
		UniversiteOgrenci o2 = new UniversiteOgrenci("kaya ünal",21796263,"BİLP");
		
		
		Araba a1=new Araba(2000,"audi","gri");
		SporAraba sporAraba=new SporAraba(2000,"BMW","GRİ",true);
		
		//araba.yazdir();
		sporAraba.yazdir();
	}

}
