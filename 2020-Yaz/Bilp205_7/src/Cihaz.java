
public abstract class Cihaz {
	
	private int model;
	
	
	public Cihaz(int model) {
		this.model=model;
	}
	
	public abstract void baslat();
	public abstract void kapat();
	
	
	protected void modelBilgi() {
		System.out.println("Üretim yılı: "+model);
	}

	

	
	
}
