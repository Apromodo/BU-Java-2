
public class MysqlDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("mysql ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("mysql silme");		
	}

	@Override
	public void get() {
		System.out.println("mysql alma");		
	}

	@Override
	public void update() {
		System.out.println("mysql güncelleme");		
	}

}
