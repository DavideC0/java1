
public class Persona {
	private String nome;
	private String codFisc;
	private int eta;
	public Persona(String nome, String codFisc, int eta) {
		super();
		this.nome = nome;
		this.codFisc = codFisc;
		this.eta = eta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodFisc() {
		return codFisc;
	}
	public void setCodFisc(String codFisc) {
		this.codFisc = codFisc;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", codFisc=" + codFisc + ", eta=" + eta + "]";
	}
	
}
