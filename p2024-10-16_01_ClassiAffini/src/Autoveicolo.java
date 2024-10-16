
public class Autoveicolo {
	int cilindrata;
	double consumo;
	double serbatoio;
	String colore;
	float prezzo;
	public Autoveicolo(int cilindrata, double consumo, double serbatoio, String colore, float prezzo) {
		super();
		this.cilindrata = cilindrata;
		this.consumo = consumo;
		this.serbatoio = serbatoio;
		this.colore = colore;
		this.prezzo = prezzo;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public double getSerbatoio() {
		return serbatoio;
	}
	public void setSerbatoio(double serbatoio) {
		this.serbatoio = serbatoio;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public double calcolaDistanza(double velocitaMedia, double ore) {
		return velocitaMedia * ore;
	}
}
