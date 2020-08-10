
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Araba araba1=new Araba();
		//haraketTest(araba);
		//arabaHaraketTest(araba);
		
		Robot robot1=new Robot();
		//haraketTest(robot);
		//robotHaraketTest(robot);
		
		Araba araba2=new Araba();

		
		IHaraket[] haraketDizisi=new IHaraket[3];
		haraketDizisi[0]=araba1;
		haraketDizisi[1]=robot1;
		haraketDizisi[2]=araba2;
		
		
		for (IHaraket ih:haraketDizisi)
		{
			ih.dur();
			ih.ilerle();
			ih.geri();
			System.out.println("----------------");
		}
		
		
		Bilgisayar bilgisayar1=new Bilgisayar();
		Bilgisayar bilgisayar2=new Bilgisayar();
		
		
		ICalismaModu[] calismaModlular=new ICalismaModu[3];
		
		calismaModlular[0]=bilgisayar1;
		calismaModlular[1]=robot1;
		calismaModlular[2]=bilgisayar2;
		for(ICalismaModu cm:calismaModlular) {
			
			cm.baslat();
			cm.kapat();
			cm.uyut();
			System.out.println("----------------");
		}
		
		
		
		
		
		
	}
	
	/*
	
	private static void arabaHaraketTest(Araba araba) {
		
		araba.ilerle();
		araba.dur();
		araba.geri();
	}
	private static void robotHaraketTest(Robot robot) {
		
		robot.ilerle();
		robot.dur();
		robot.geri();
	}

	

	private static void haraketTest(IHaraket haraketli) {
		
		//haraket interfece iden nherhangi bir nesneyi kabul eder
		
		haraketli.dur();
		haraketli.ilerle();
		haraketli.geri();
		
	}
	
	*/
}
