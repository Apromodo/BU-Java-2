
public class Bilp205_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kamera kamera=new Kamera(2015);
		// kamera.baslat();
		// kamera.kapat();

		// Kamyon kamyon=new Kamyon(12, 5000);
		// kamyon.ilerle();
		// kamyon.dur();

		// Futbolcu futbolcu=new Futbolcu();
		// futbolcu.sabahAntrenman();
		// futbolcu.aksamAntrenman();
		Sporcu s=new Futbolcu();

		Sporcu futbolcu = new Sporcu() {
			@Override
			public void sabahAntrenman() {
				// TODO Auto-generated method stub

			}

			@Override
			public void aksamAntrenman() {
				// TODO Auto-generated method stub

			}

		};
		futbolcu.sabahAntrenman();
		futbolcu.aksamAntrenman();

		Kontrol robot = new Kontrol() {

			@Override
			public void start() {
				System.out.println("robot started ");

			}

			@Override
			public void pause() {
				System.out.println("robot has been paused ");

			}

			@Override
			public void stop() {
				System.out.println("robot has been stoped");

			}

		};

		robot.start();
		robot.pause();
		robot.stop();

		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		System.out.println("p3 " + p3.getId());
	}

}
