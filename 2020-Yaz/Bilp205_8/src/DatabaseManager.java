
public class DatabaseManager {

	
	public void addDatabase(IDatabase iDatabase) {
		
		iDatabase.add();
		
		
	}
	


    public void deleteDatabase(IDatabase iDatabase) {
		
		iDatabase.delete();
		
		
	}

    public void updateDatabase(IDatabase iDatabase) {
	
	    iDatabase.update();
	
	
}

     public void getDatabase(IDatabase iDatabase) {
	
	    iDatabase.get();
	
	
}
	
}
