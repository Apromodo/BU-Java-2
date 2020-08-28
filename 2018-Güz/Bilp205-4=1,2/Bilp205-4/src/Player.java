
public class Player {

	private int id;
	public static int sayac;

	public Player() {
		sayac++;
		id = sayac;

	}

	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
}
