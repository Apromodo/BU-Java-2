import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
	        int tamSayi = 1;
	        int cikart = 2;
	        int listeYazdir = 0;
	        int cikis = 0;
	        
	        Scanner sc1 = new Scanner(System.in);
	        Scanner sc2 = new Scanner(System.in);
	        
	        ArrayList<Integer> sayilar = new ArrayList<Integer>();
	        
	        while(cikis == 0) {
	            
	            System.out.print("Listeye tam sayı eklemek için 1, çıkarmak için 2, listeyi yazdırmak için 0, çıkmak için -1 giriniz: ");
	            int scanner = sc1.nextInt();
	            
	            if(scanner == tamSayi) {
	                System.out.print("Listeye eklemek istediğiniz sayıyı giriniz: ");
	                int scanner2 = sc2.nextInt();
	                sayilar.add(scanner2);
	                
	            }else if(scanner == 2) {
	                
	                System.out.print("Listeden çıkarmak istediğiniz sayının indeksini giriniz: ");
	                int scanner2 = sc2.nextInt();
	                sayilar.remove(scanner2);
	                
	            }else if(scanner == listeYazdir) {
	                
	                for(int i = 0; i<sayilar.size();i++) {
	                    
	                    System.out.print(sayilar.get(i) + ", ");
	                }
	                
	                System.out.println(" ");
	            }else {
	                cikis = -1;
	                break;           
	            }   
	        }
    }
}
