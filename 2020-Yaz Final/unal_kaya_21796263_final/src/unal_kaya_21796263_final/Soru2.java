package unal_kaya_21796263_final;

import java.util.HashMap;
import java.util.Scanner;

public class Soru2 {

    public static void main(String[] args) {
        HashMap<String, Integer> hesaplar = new HashMap<String, Integer>();

        Scanner myObj = new Scanner(System.in);

        while(true){
            System.out.print("Para yatirmak istediğiniz hesabi seciniz (Cikmak icin X) : ");
            String hesap = myObj.nextLine();
            if(hesap.equals("X")){
                System.out.print("Program sonlandı.");
                break;
            }
            System.out.print("Yatırmak istediginiz miktari giriniz : ");
            int miktar = myObj.nextInt();
            myObj.nextLine();

            try{
                int bakiye = hesaplar.get(hesap);
                hesaplar.put(hesap, (bakiye + miktar));
            }catch(Exception e){
                System.out.println("Daha önce " + hesap + " yoktu.Hesap açıldı.");
                hesaplar.put(hesap, miktar);
            }
            System.out.println("Yeni Durum");
            for (String i : hesaplar.keySet()) {

                System.out.println(i + " hesabındaki bakiye: " + hesaplar.get(i));
            }
            System.out.println("----------------------");

        }
    }
}
