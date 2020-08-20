import java.util.Comparator;

public class SayiKarsilastirici implements Comparator<Integer>{

	@Override
	public int compare(Integer sayi1, Integer sayi2) {
		
		if (sayi1<sayi2)
			return 1;
		
		else if (sayi1>sayi2)
			return -1;
		
		else
			return 0;
		
		
//		return -sayi1.compareTo(sayi2);
		
	}

}
