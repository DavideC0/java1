import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Consumatore extends Thread {
	public static ReentrantLock mtx = new ReentrantLock();
	public Random rng = new Random();
	public void run() {
		int somma_tempo = 0;
		int somma_num = 0;
		int counter = 0;
		while (true) {
			try {
				int tempo = rng.nextInt(100,500);
				somma_tempo += tempo;
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			while (!Main.coda.isEmpty()) {
				somma_num += Main.coda.poll();
				counter++;
			}
			if (somma_tempo > 2000) {
				System.out.println("Somma numeri: " + somma_num);
				System.out.println("Media numeri: " + (somma_num/counter));
				somma_tempo = 0;
			}
		}
	}
}
