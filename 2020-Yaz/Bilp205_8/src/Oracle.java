
public class Oracle implements IDatabase{

	@Override
	public void add() {
		System.out.println("Oracle ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle silme");		
	}

	@Override
	public void get() {
		System.out.println("Oracle alma");		
	}

	@Override
	public void update() {
		System.out.println("Oracle güncelleme");		
	}

}
