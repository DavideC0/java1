
public class Consumatore extends Thread {
	public void run() {
		for (int i=0; i<Main.numeri.length; i++) {
			System.out.println(Main.numeri[i]);
			Main.numeri[i] = null;
		}
	}

}
