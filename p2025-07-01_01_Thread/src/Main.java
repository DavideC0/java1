import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rng = new Random();
		EsempioThread th1 = new EsempioThread(rng.nextInt(1,10), rng.nextInt(90,100));
		EsempioThread th2 = new EsempioThread(rng.nextInt(1,10), rng.nextInt(90,100));
		System.out.println("Stato Thread 1:" + th1.getState());
		System.out.println("Stato Thread 2:" + th2.getState());
		th1.start();
		th2.start();
		System.out.println("Stato Thread 1:" + th1.getState());
		System.out.println("Stato Thread 2:" + th2.getState());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Stato Thread 1:" + th1.getState());
		System.out.println("Stato Thread 2:" + th2.getState());
	}

}
