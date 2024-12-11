import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Produttore extends Thread {
	public static ReentrantLock mtx = new ReentrantLock();
	public Random rng = new Random();
	public void run() {
		while (true) {
			try {
				Thread.sleep(rng.nextInt(100,1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Main.coda.add(rng.nextInt(0,100));
		}
			
	}
}
