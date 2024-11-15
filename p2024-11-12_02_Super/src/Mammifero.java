public abstract class Mammifero {

	private int freq_card;
	private int peso;
	private int zampe;
	private int freq_resp;
	
	public Mammifero(int freq_card, int peso, int zampe, int freq_resp) {
		super();
		this.freq_card = freq_card;
		this.peso = peso;
		this.zampe = zampe;
		this.freq_resp = freq_resp;
	}
	
	public Mammifero() {
		super();
	}
	
	@Override
	public String toString() {
		return "Mammiferi [freq_card=" + freq_card + ", peso=" + peso + ", zampe=" + zampe + ", freq_resp=" + freq_resp
				+ "]";
	}
	
	public int getFreq_card() {
		return freq_card;
	}
	
	public void setFreq_card(int freq_card) {
		this.freq_card = freq_card;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getZampe() {
		return zampe;
	}
	
	public void setZampe(int zampe) {
		this.zampe = zampe;
	}
	
	public int getFreq_resp() {
		return freq_resp;
	}
	
	public void setFreq_resp(int freq_resp) {
		this.freq_resp = freq_resp;
	}
	
	public abstract String Verso();
}