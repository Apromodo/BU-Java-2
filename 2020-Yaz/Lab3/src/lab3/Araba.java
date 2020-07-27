package lab3;

 class Araba{
	   public Araba()
	   {
		System.out.println("sınıf araba");
	   }
	   public void aracTürü()
	   {
		System.out.println("taşıt türü araba");
	   }
	}
	class bmw extends Araba{
	   public bmw()
	   {
		System.out.println("sınıfı: ");
	   }
	   public void marka()
	   {
		System.out.println("markası: ");
	   }
	   public void hiz()
	   {
		System.out.println("azami hızı: 300");
	   }
	}