import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
	static Queue<Integer> coda = new LinkedList<Integer>();
	static ReentrantLock mtx = new ReentrantLock();

	public static void main(String[] args) {
		
		ProduttoreRapido produttore1 = new ProduttoreRapido();
		ProduttoreRapido produttore2 = new ProduttoreRapido();
		ProduttoreRapido produttore3 = new ProduttoreRapido();
		ProduttoreRapido produttore4 = new ProduttoreRapido();
		ConsumatoreRapido consumatore1 = new ConsumatoreRapido();
		ConsumatoreRapido consumatore2 = new ConsumatoreRapido();
		ConsumatoreRapido consumatore3 = new ConsumatoreRapido();
		ConsumatoreRapido consumatore4 = new ConsumatoreRapido();
		produttore1.start();
		produttore2.start();
		produttore3.start();
		produttore4.start();
		consumatore1.start();
		consumatore2.start();
		consumatore3.start();
		consumatore4.start();
	}
}
