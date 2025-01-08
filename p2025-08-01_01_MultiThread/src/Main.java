public class Main {

	static ContoCorrente conto = new ContoCorrente();
	
	public static void main(String[] args) throws InterruptedException {
	
		ClienteNonSync c3 = new ClienteNonSync("Mario", 20);
		
		ClienteNonSync c4 = new ClienteNonSync("Lucia", 50);
		
		
		// Avvio i Threads
		c3.start();
		c4.start();
		
		 
		
		// Attendo il completamento
		
		c3.join();
		System.out.println(conto.getSaldo());
		c4.join();
		System.out.println(conto.getSaldo());
	 }


}