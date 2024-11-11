import java.util.ArrayList;

public class Compagnia {
	private String nome;
	private ArrayList<Aereo> aerei = new ArrayList<Aereo>();

	public Compagnia(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Aereo> getAerei() {
		return aerei;
	}

	public void addAereo(Aereo aereo) {
		this.aerei.add(aereo);
	}
	
	//prenota un posto di un aereo scelto
	public Boolean prenota(int indice) {
		if (aerei.get(indice).getPostiLiberi() == 0) {
			return false;
		}
		for (int i=0; i<10; i++) {
			if (!aerei.get(indice).getPosti()[i]) {
				aerei.get(indice).setPostiTrue(indice);
				aerei.get(indice).decPostiLiberi();
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Compagnia [nome=" + nome + ", aerei=" + getAerei() + "]";
	}
	
	
}
