
public class Persona {
	private String nome;
	private float temperatura;

	public float getTemperaturaCelsius() {
		return temperatura;
	}

	public void setTemperaturaCelsius(float temperatura) {
		this.temperatura = temperatura;
	}
	
	public float getTemperaturaFarHenheit() {
		return (float)(temperatura*(9.0/5.0) + 32.0);
	}

	public void setTemperaturaFarHenheit(float temperatura) {
		this.temperatura = (float)((temperatura-32)/(9.0*5.0));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
