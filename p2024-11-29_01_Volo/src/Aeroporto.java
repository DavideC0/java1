import java.time.LocalDateTime;
import java.util.List;

public class Aeroporto {

    private String nome;
    private String luogo;
    private List<Volo> aereiImbarcati;
	public Aeroporto(String nome, String luogo, List<Volo> aereiImbarcati) {
		super();
		this.nome = nome;
		this.luogo = luogo;
		this.aereiImbarcati = aereiImbarcati;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLuogo() {
		return luogo;
	}
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	public List<Volo> getAereiImbarcati() {
		return aereiImbarcati;
	}
	public void setAereiImbarcati(List<Volo> aereiImbarcati) {
		this.aereiImbarcati = aereiImbarcati;
	}
    
    public void imbarco(Volo v) {
    	if (!v.getImbarco()) {
    		v.setImbarco(true);
    		System.out.println("Il volo è stato imbarcato");
    	} else {
    		System.out.println("Il volo è già stato imbarcato");
    	}
    }

    //decollo(aereo)
    public void decollo(Volo v) {
    	if (v.getOrarioPartenza().isEqual(LocalDateTime.now()) || v.getOrarioPartenza().isBefore(LocalDateTime.now())) {
    		System.out.println("Il volo è decollato");
    	} else {
    		System.out.println("Il volo non è ancora partito");
    	}
    }
    //atteraggio(aereo)
    public void atterraggio(Volo v) {
    	if (v.getOrarioArrivo().isEqual(LocalDateTime.now()) || v.getOrarioArrivo().isBefore(LocalDateTime.now())) {
    		System.out.println("Il volo è arrivato");
    	} else {
    		System.out.println("Il volo non è ancora arrivato");
    	}
}
}