
public class MongoDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("mongodatabase ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("mongodatabase silme");		
	}

	@Override
	public void get() {
		System.out.println("mongodatabase alma");		
	}

	@Override
	public void update() {
		System.out.println("mongodatabase güncelleme");		
	}

}
