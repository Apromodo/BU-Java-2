package unal_kaya_21796263;

public class MainClass {

    public static void main(String[] args){

        Kedi kedi = new Kedi(true);

        String sinifAdi = kedi.sinifAdiYaz();
        String asiliMi = kedi.asiliMi();
        String dogumTarihi = kedi.dogumTarihi();

        System.out.println(sinifAdi);
        System.out.println(asiliMi);
        System.out.println(dogumTarihi);
        System.out.println(kedi.kisirMi());
        
        
        Ust ust =new Ust();
		Orta orta=new Orta();
		Alt alt=new Alt();

		
		Ust[] metodDizisi=new Ust[3];
		metodDizisi [0]= ust;
		metodDizisi [1]= orta;
		metodDizisi [2]= alt;
		
		
		for (Ust md:metodDizisi)
		{
			md.metod ();
			System.out.println("-------------");
			
		}

        


    }
}
