
public abstract class Tasit {

	private int tekerSayisi;
	private int agirlik;

	public Tasit(int tekerSayisi, int agirlik) {
		this.tekerSayisi = tekerSayisi;
		this.agirlik = agirlik;
	}

	public abstract void ilerle();

	public abstract void dur();
}
