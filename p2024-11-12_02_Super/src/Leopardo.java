
public class Leopardo extends Mammifero{

	private Integer velocita;
	
	public Leopardo() {
		super();
	}

	public Leopardo(int freq_card, int peso, int zampe, int freq_resp, Integer velocita) {
		super(freq_card, peso, zampe, freq_resp);
		this.velocita = velocita;
	}

	@Override
	public String toString() {
		return "Leopardo [velocita=" + velocita + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String Verso() {
		return "Roarrrrrrrrr";
	}

	public Integer getVelocita() {
		return velocita;
	}

	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}

}
