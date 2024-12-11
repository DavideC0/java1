import java.util.Random;

public class ConsumatoreRapido extends Thread {
	public Random rng = new Random();
	public void run() {
		int somma_num = 0;
		int counter = 0;
		while (true) {
			Main.mtx.lock();
			while (!Main.coda.isEmpty()) {
				somma_num += Main.coda.poll();
				counter++;
			}
			Main.mtx.unlock();
			System.out.println("Somma numeri: " + somma_num);
			System.out.println("Media numeri: " + (somma_num/counter));
			System.out.println("Counter: " + counter);
		}
	}
}
