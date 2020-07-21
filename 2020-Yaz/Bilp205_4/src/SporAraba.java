
public class SporAraba extends Araba{

	public boolean spoiler;

	public SporAraba(int model, String marka, String renk,boolean spoiler) {
		super(model,marka,renk);
		this.spoiler=spoiler;
	}
	
	
	public void yazdir() {
		super.yazdir();
		System.out.println(spoiler);
	}
	
	
}
