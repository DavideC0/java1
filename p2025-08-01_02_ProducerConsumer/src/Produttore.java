import java.util.Random;

public class Produttore extends Thread {
	public void run() {
		Random rng = new Random();
		for (int i=0; i<Main.numeri.length; i++) {
			Main.numeri[i] = rng.nextInt();
		}
	}
}
