import java.util.ArrayList;
import java.util.Collections;

public class Bilp205_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("eskisehir");
		strList.add("adana");
		strList.add("van");
		strList.add("kirikaleli");
		strList.add("mersin");
		strList.add("istambul");

		StringKarsilastirici karsilastiricim = new StringKarsilastirici();
//		colections.sort(strlisit)

		System.out.println(strList);
		for (String s : strList)
			System.out.println(s);
		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(8);
		intList.add(4);
		intList.add(7);
		intList.add(5);
		intList.add(6);

		Collections.sort(intList, karsilastiricim);
//		Collections.sort(intList);
		for (Integer n : intList)
			System.out.println(n);
	}

}
