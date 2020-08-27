package unal_kaya_21796263_final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Soru3 {

    public static void main(String[] args) {

        ArrayList<Takim> arraylist = new ArrayList<Takim>();

        Takim t1=new Takim("Sivasspor",14,63.0);
        Takim t2=new Takim("Trabzonspor",25,66.0);
        Takim t3=new Takim("Alanyaspor",26,57.0);
        Takim t4=new Takim("Başakşehir",33,73.0);
        Takim t5=new Takim("Beşiktaş",20,63.0);

        arraylist.add(t1);
        arraylist.add(t2);
        arraylist.add(t3);
        arraylist.add(t4);
        arraylist.add(t5);

        System.out.println("SIRALAMADAN ÖNCE");

        for(Takim str: arraylist){
            System.out.println(str);
        };


        System.out.println("SIRALADIKTAN SONRA");
        Collections.sort(arraylist);

        for(Takim str: arraylist){
            System.out.println(str);
        };
    }
}
