import java.util.Arrays;

public class Aereo {
	private String nome;
	private Boolean[] posti = new Boolean[10];
	private int postiLiberi = 10;
	public Aereo(String nome) {
		super();
		this.nome = nome;
		Arrays.fill(posti, false);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean[] getPosti() {
		return posti;
	}
	public void setPostiTrue(int indice) {
		this.posti[indice] = true;
	}
	public int getPostiLiberi() {
		return this.postiLiberi;
	}
	
	public void decPostiLiberi() {
		this.postiLiberi--;
	}
	
	public int getpostiOccupati() {
		return 10-getPostiLiberi();
	}
	@Override
	public String toString() {
		return "\nAereo [nome=" + nome + ", posti liberi=" + getPostiLiberi() + ", posti occupati="+ getpostiOccupati() +"]";
	}
}
