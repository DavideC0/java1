
public class Persona {
	private String nome;
	private String cognome;
	private String codice_fiscale;
	private int eta;
	private String indirizzo;
	private String telefono;
	public Persona(String nome, String cognome, String codice_fiscale, int eta, String indirizzo, String telefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codice_fiscale = codice_fiscale;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodice_fiscale() {
		return codice_fiscale;
	}
	public void setCodice_fiscale(String codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", codice_fiscale=" + codice_fiscale + ", eta=" + eta
				+ ", indirizzo=" + indirizzo + ", telefono=" + telefono + "]";
	}
	
}
