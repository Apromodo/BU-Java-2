
public abstract class Cihaz{

	public int model;

	public Cihaz(int model) {
		this.model = model;
	}

	public abstract void baslat();

	public abstract void kapat();

	public void modelBilgi() {
		System.out.println("cihaz model " + model);

	}
}
