
public class MainClass {
	
	
	public static void main(String args[]){
		
		Kopek ko = new Kopek();
		sesler(ko);
		
		Kedi ke = new Kedi();
		sesler(ke);
		
		Hindi he = new Hindi();
		sesler(he);
		
		
	   }
	
	
     public static void sesler(Hayvanlar ss) {
		
		
	    ss.konusmaSesi();
		
		
	}
	
	
}
