
public class Balena extends Mammifero {

	private String habitat;
	
	public Balena() {
		super();
	}

	public Balena(int freq_card, int peso, int zampe, int freq_resp, String habitat) {
		super(freq_card, peso, zampe, freq_resp);
		this.habitat = habitat;
	}

	@Override
	public String Verso() {
		return "Bahahahahahahah";
	}

	@Override
	public String toString() {
		return "Balena [habitat=" + habitat + ", toString()=" + super.toString() + "]";
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}
