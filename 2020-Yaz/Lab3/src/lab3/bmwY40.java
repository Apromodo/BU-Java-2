package lab3;

public class bmwY40 extends bmw{

	   public bmwY40()
	   {
		System.out.println("model: bmw 40.yıl");
	   }
	   public void hiz()
	   {
		System.out.println("azami hızı: 300");
	   }
	   public static void main(String args[])
	   {
		 bmwY40 obj=new bmwY40();
		 obj.aracTürü();
		 obj.marka();
		 obj.hiz();
	   }
	}

