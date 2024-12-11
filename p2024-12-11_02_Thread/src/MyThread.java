import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
	static public long num=0;
	static public ReentrantLock mtx = new ReentrantLock();
	public void run() {
		mtx.lock();
		System.out.println("Ciao");
		System.out.println("come");
		System.out.println("va");
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("=====================FINE=====================");
		mtx.unlock();
	}
}
