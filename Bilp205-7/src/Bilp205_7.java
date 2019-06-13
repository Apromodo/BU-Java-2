import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Bilp205_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=null;
		ArrayList<Double> list=new ArrayList<Double>();
		try {
			File file=new File("weather-2015-09-08.csv");
			scanner=new Scanner(file);
			if(scanner.hasNextLine())
				scanner.nextLine();
			while(scanner.hasNextLine()) {
				String satir=scanner.nextLine();
				String[] dizi=satir.split(",");
				System.out.println(dizi[1]);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("dosya bulunamadı. ");
			
		}
		finally {
			if(scanner!=null)
				scanner.close();
			
			
		}
	}

}
