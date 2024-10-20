
public class Cibo {
	private String nome;
	private double peso;
	private double calorie;
	public Cibo(String nome, double peso, double calorie) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.calorie = calorie;
	}
	
	public Cibo() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getCalorie() {
		return calorie;
	}
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	@Override
	public String toString() {
		return "Cibo [nome=" + nome + ", peso=" + peso + ", calorie=" + calorie + "]";
	}
	
}
