public class Kamera extends Cihaz {

	public Kamera(int model) {
		super(model);
	}

	@Override
	public void baslat() {
		System.out.println("Kamera Açılıyor.");

	}

	@Override
	public void kapat() {
		System.out.println("Kamera Kapanıyor.");
	}

}