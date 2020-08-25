import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> liste1=new ArrayList<Integer>();
		ArrayList<String> liste2=new ArrayList<String>();
		
		liste1.add(28);
		liste1.add(85);
		liste1.add(36);
		
		for (Integer no:liste1)
			System.out.println(no);
		
		liste2.add("volkan");
		liste2.add("esra");
		liste2.add("kemal");
		
		System.out.println("numara girin ");
		int arananNo=sc.nextInt();
		
		/*
		int bulunanIndeks=-1;
		
		for (int i=0;i<liste1.size();i++)
		{
			if (liste1.get(i)==arananNo)
			{
				bulunanIndeks=i;
			}
			
		}
		*/
		
		int bulunanIndeks=liste1.indexOf(arananNo);
		
		if (bulunanIndeks==-1)
			System.out.println("aradığınız numara listede yok.");
		
		else
			System.out.println("aradığnız "+arananNo+" numarının sahibi "+liste2.get(bulunanIndeks));
			
			
	}

}