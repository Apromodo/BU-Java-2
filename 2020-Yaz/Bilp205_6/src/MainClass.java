import java.util.Arrays;

public abstract class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		Samuray samuray=new Samuray();
		Samuray yeniceri=new Samuray();
		
		
		Daire daire=new Daire(5);
		Dikdortgen dikdortgen=new Dikdortgen(5, 10);
		
		
		System.out.println(daire.alanHesapla());
		System.out.println(dikdortgen.alanHesapla());
		daire.yaz();
		
		
		
		
		String[] yazarlar= {"thomas","finley"};
		Kitap kitap=new Kitap("calculus",452,1990,yazarlar,true);
		System.out.println(kitap);
		
		
		
		String[] yazarlar2= {"yigit özgür","alpay erdem","erdil yaşaroğlu"};
		Dergi dergi=new Dergi("Uykusuz",30,2020,yazarlar2,46);
		System.out.println(dergi);
		
		
		
		String[] yazarlar= {"thomas","finley"};
		
		
		for(String yazar:yazarlar)
			System.out.println(yazar);
		
		
		System.out.println(Arrays.toString(yazarlar));
		
		
		*/
		
		TurkceMenu tm=new TurkceMenu();
		test(tm);
		IngilizceMenu im=new IngilizceMenu();
		test(im);
		FransizcaMenu fm=new FransizcaMenu();
		test(fm);
		
		
	}
	
//	public static void test(TurkceMenu tm) {
//		
//		//Sabah.gündüz.akşam
//		
//		tm.sabah();
//		tm.gunduz();
//		tm.aksam();
//		
//	}
	
public static void test(GirisMenu gm) {
		
		//hepsini ana sınıftan çekerek yazma
		
		gm.sabah();
		gm.gunduz();
		gm.aksam();
		
	}
	
	
	
	

}
