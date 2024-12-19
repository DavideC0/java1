import java.time.LocalDate;

public class Persona {
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataNascita;
	private Boolean attivo;
	private Boolean fuori;
	private int badge;
	public Persona(String nome, String cognome, String email, LocalDate dataNascita, int badge) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = dataNascita;
		this.badge = badge;
		this.attivo = true;
		this.fuori = true;
	}
	public Persona() {
		super();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public Boolean getAttivo() {
		return attivo;
	}
	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}
	public Boolean getFuori() {
		return fuori;
	}
	public void setFuori(Boolean fuori) {
		this.fuori = fuori;
	}
	public int getBadge() {
		return badge;
	}
	public void setBadge(int badge) {
		this.badge = badge;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", dataNascita=" + dataNascita
				+ ", attivo=" + attivo + ", fuori=" + fuori + ", badge=" + badge + "]";
	}
	
}
