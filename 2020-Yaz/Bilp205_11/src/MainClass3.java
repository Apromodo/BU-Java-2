import java.util.ArrayList;
import java.util.Collections;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Film> liste=new ArrayList<Film>();
		
		liste.add(new Film("god father ",1970,170,9.5));
		liste.add(new Film("Matrix",1999,123,9.0));
		liste.add(new Film("tenet",2020,117,8.6));
		liste.add(new Film("contact",1995,143,7.8));
		
		
		System.out.println("sıralamadan önce");
		System.out.println(liste);
		
		Collections.sort(liste);
		
		System.out.println("sıralamadan sonra");
		for (Film f:liste)
		System.out.println(f);

	}

	
}
