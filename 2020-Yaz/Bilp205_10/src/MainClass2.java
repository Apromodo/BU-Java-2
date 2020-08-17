
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] dizi = {7, 5, 4, 2};
		
		int i=1;
		
		
		
		for (int i1=1;i1<dizi.length;i1++) {
			
			int enKucuk=dizi[1];
			int min_indeks=1;
			
			for (int j=i1;j<dizi.length;j++) {
				
				if (dizi[j]>dizi[min_indeks]) {
					enKucuk=dizi[j];
					min_indeks=j;
				}
				
				
			}
			
			int yedek=dizi[i1];
			dizi[i1]=enKucuk;
			dizi[min_indeks]=yedek;
			
		}
		
		for(int sayi:dizi)
		
		System.out.println(sayi+",");

	}

}
