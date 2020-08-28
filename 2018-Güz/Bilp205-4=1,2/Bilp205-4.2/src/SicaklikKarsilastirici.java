import java.util.Comparator;

public class SicaklikKarsilastirici implements Comparator<HavaDurumu>
{

	@Override
	public int compare(HavaDurumu hd1, HavaDurumu hd2) {
		
		if(hd1.getSicaklik()>hd2.getSicaklik())
			return -1;
		else if(hd1.getSicaklik()<hd2.getSicaklik())
			return 1;
		else
			return 0;
		
	}

}
