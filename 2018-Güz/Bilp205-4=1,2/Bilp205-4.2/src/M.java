import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M {

	public static void main(String[] args) {

		String dosyaAdi = "weather-2015-09-08.csv";

		ArrayList<HavaDurumu> havaList = oku(dosyaAdi);
		Collections.sort(havaList,new SicaklikKarsilastirici());
		
		for(HavaDurumu hd:havaList)
			System.out.println(hd);
	}

	
		
	
	public static ArrayList<HavaDurumu> oku(String dosyaAdi) {
		ArrayList<HavaDurumu> havaList=new ArrayList<HavaDurumu>();
		Scanner scanner = null;
		try {
			File file = new File(dosyaAdi);
			scanner = new Scanner(file);
			if (scanner.hasNextLine())
				scanner.nextLine();
			while (scanner.hasNextLine()) {
				String satir = scanner.nextLine();
				String[] tekSatirDizi = satir.split(",");
				double sicaklik = Double.parseDouble(tekSatirDizi[1]);
				double nem = Double.parseDouble(tekSatirDizi[1]);
				String tarih = tekSatirDizi[13];
				HavaDurumu hd = new HavaDurumu(sicaklik, nem, tarih);
				havaList.add(hd);

			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi ");

		} finally {
			if (scanner == null)
				scanner.close();
		}
		return havaList;
	}

}
