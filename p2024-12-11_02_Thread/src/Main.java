
public class Main {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
