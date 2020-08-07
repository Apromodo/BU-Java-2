
public class Kamera extends Cihaz{
	

	public Kamera(int model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void baslat() {
		System.out.println("Kamera açılıyor");
		
	}

	@Override
	public void kapat() {
		System.out.println("kamera kapanıyor");
	}

	
	public void test() {
		super.modelBilgi();
	}
	

}
