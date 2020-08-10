
public class Robot implements IHaraket, ICalismaModu {

	
	@Override
	public void ilerle() {
		System.out.println("Robot ilerliyor");
		
	}

	@Override
	public void dur() {
		System.out.println("Robot durdu");
		
	}

	@Override
	public void geri() {
		System.out.println("Robot geri geliyor");
		
	}

	@Override
	public void baslat() {
		System.out.println("Robot başlatılıyor");
		
	}

	@Override
	public void kapat() {
		System.out.println("Robot kapatılıyor");
		
	}

	@Override
	public void uyut() {
		System.out.println("Robot uyutuluyor");
		
	}

}
