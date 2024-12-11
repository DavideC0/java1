import java.util.Random;

public class ProduttoreRapido extends Thread {
	public Random rng = new Random();
	public void run() {
		while (true) {
			Main.mtx.lock();
			Main.coda.add(rng.nextInt(0,100));
			Main.mtx.unlock();
		}
			
	}
}
