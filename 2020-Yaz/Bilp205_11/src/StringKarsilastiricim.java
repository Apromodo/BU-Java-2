import java.util.Comparator;

public class StringKarsilastiricim implements Comparator<String>{   //camparator=karşılaştırıcı

	@Override
	public int compare(String str1, String str2) { //compare=karşılaştır
		
		
		if (str1.length()<str2.length())          //str1 in uzunluğu daha kısa ise önce gelsin
			return -1;
		
		else if (str1.length()>str2.length())
			return 1;
		else
			return 0;
	}

}
