import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bilp205_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*try {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("ilk sayi giriniz: ");
			int sayi1 = scanner.nextInt();
			System.out.println("ikinci sayıyı girin ");
			int sayi2 = scanner.nextInt();
			int sonuc = sayi1 / sayi2;
			System.out.println(sonuc);
			
		} 
		catch (ArithmeticException e) {
			System.out.println("ikinci sayıyı giremezsiniz!");
		} 
		catch(InputMismatchException e) {
			System.out.println("sadece sayı! ");
			
		}
		finally {
			System.out.println("program işlemi başarı ile sonlandırdı :) ");
	
		}
		*/
		
		Scanner scanner=null;
		String str="";
		try {
			File file=new File("test.text");
			scanner=new Scanner(file);
			while(scanner.hasNext())
			{
				str+=scanner.nextLine()+"\n";
			}
		}
		
		catch (FileNotFoundException e) {
			System.out.println("404 Fil e Not Found !");
		}
		System.out.println(str);
	}

}
