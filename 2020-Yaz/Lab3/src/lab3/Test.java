package lab3;

	class Bisiklet 
	{ 

		public int vites; 
		public int hiz; 
			

		public Bisiklet(int vites, int hiz) 
		{ 
			this.vites = vites; 
			this.hiz = hiz; 
		} 
			
		
		public void frenYap(int decrement) 
		{ 
			hiz -= decrement; 
		} 
			
		public void hizYukselt(int increment) 
		{ 
			hiz += increment; 
		} 
		
		
		public String toString() 
		{ 
			return("mevcut vites "+vites 
					+"\n"
					+ "bisiklet hızı "+hiz); 
		} 
	} 

	
	class dagBisikleti extends Bisiklet 
	{ 
		
		
		public int seleYüksek; 

		
		public dagBisikleti(int gear,int speed, 
							int startHeight) 
		{ 
			 
			super(gear, speed); 
			seleYüksek = startHeight; 
		} 
			
		 
		public void setHeight(int newValue) 
		{ 
			seleYüksek = newValue; 
		} 
		
		
		@Override
		public String toString() 
		{ 
			return (super.toString()+ 
					"\nsele yüksekliği "+seleYüksek); 
		} 
		
	} 

	public class Test 
	{ 
		public static void main(String args[]) 
		{ 
			
			dagBisikleti mb = new dagBisikleti(3, 100, 25); 
			System.out.println(mb.toString()); 
				
		} 
	} 


