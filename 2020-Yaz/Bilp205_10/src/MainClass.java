import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		

		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> liste=new ArrayList<Integer>();
		
		liste.add(5);
		liste.add(8);
		liste.add(9);
		liste.add(4);
		liste.add(9);
		System.out.println("aranan sayiyi gir");
		
		int arananSayi = sc.nextInt();
		int indeks=indeksBul(liste,arananSayi);
		
		
	}
	
	static int indeksBul(ArrayList<Integer> liste,int arananSayi) {

		
		int indeks=-1;
		
		for(int i=0;i<liste.size();i++) {
			if(liste.get(i)==arananSayi)
			{
				indeks=i;
			break;
			}
		}
		return indeks;
		
		*/
		
		int[] dizi= {5,3,8,4,6};
		
		//en baştan bir sağındaki ile kıyaslayarak
		//sondan bir önceki elemana kadar kıyaslar
		//son elemana kadar kıyaslarsa bir sağında elaman olmadığı için hata vericektir
		
		
		
		for (int i=0;(i<dizi.length-1);i++) {
			
			for(int j=0;j<(dizi.length-1);j++) // en baştan sona kadar bakmamıza gerek yok 
			{
				if(dizi[j]>dizi[j+1]) {
					
					int yedek=dizi[j]; //geçici buffer değişken 
					
					dizi[j]=dizi[j+1];
					dizi[j+1]=yedek;
					
				}
			}
		}
		
		
		for (int sayi:dizi)
			System.out.print(sayi+", ");
		
	}
	

}
