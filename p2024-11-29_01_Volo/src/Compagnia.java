import java.util.List;

public class Compagnia {

    private final String nome;
    private final List<Volo> lV;
	public Compagnia(String nome, List<Volo> lV) {
		super();
		this.nome = nome;
		this.lV = lV;
	}
	public String getNome() {
		return nome;
	}
	public List<Volo> getlV() {
		return lV;
	}
	
    public void addVolo(Volo v) {
    	if (!this.lV.contains(v)) {
    		this.lV.add(v);
    		System.out.println("Volo aggiunto correttamente");
    	}
    	System.out.println("Errore");
    }

    public void removeVolo(Volo v) {
    	if (this.lV.contains(v)) {
    		this.lV.remove(v);
    		System.out.println("Volo rimosso correttamente");
    	}
    	System.out.println("Errore");
    }

    //Agenzia.prenota

    //Adenzia.cancella
}