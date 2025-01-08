
public class ClienteNonSync extends Thread {
	
	private String nome;
	private int prelievo;
	public ClienteNonSync(String nome, int prelievo) {
		super();
		this.nome = nome;
		this.prelievo = prelievo;
	}
	
	public void run() {
		double saldo = Main.conto.getSaldo();
		if (saldo - prelievo < 0) {
			System.out.println("Prelievo impossibile");
		} else {
			System.out.println(nome + " ha prelevato " + prelievo + " euro");
			Main.conto.setSaldo(prelievo);
		}
	}

}
