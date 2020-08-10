
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DatabaseManager dbManager=new DatabaseManager();
		
		
		dbManager.addDatabase(new MysqlDatabase());
		dbManager.addDatabase(new Oracle());
		dbManager.addDatabase(new MongoDatabase());


	}

}
