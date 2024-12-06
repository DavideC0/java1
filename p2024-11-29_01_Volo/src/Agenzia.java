import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Agenzia {
	
	private List<Compagnia> lC;
	

    public Agenzia() {
		super();
	}
    
    public boolean addCompagnia(Compagnia c) {
    	if (!this.lC.contains(c)) {
    		this.lC.add(c);
    		System.out.println("Compagnia aggiunta correttamente");
    		return true;
    	}
    	System.out.println("Errore inserimento compagnia");
    	return false;
    }
    
    public boolean removeCompagnia(Compagnia c) {
    	if (this.lC.contains(c)) {
    		this.lC.remove(c);
    		System.out.println("Compagnia rimossa correttamente");
    		return true;
    	}
    	System.out.println("Errore nella rimozione della compagnia");
    	return false;
    }

	public List<Compagnia> getlC() {
		return lC;
	}


	//cercaVolo(String destinazione)
	public ArrayList<Volo> cercaVoloDestinazione(String destinazione) {
		ArrayList<Volo> listaRitorno = new ArrayList<Volo>();
		for (Compagnia compagnia: this.lC) {
			for (Volo volo: compagnia.getlV()) {
				if (destinazione.equals(volo.getArrivo()) && !volo.getImbarco()) {
					listaRitorno.add(volo);
				}
			}
		}
		return listaRitorno;		
	}
	public ArrayList<Volo> cercaVoloData(LocalDateTime data) {
		ArrayList<Volo> listaRitorno = new ArrayList<Volo>();
		for (Compagnia compagnia: this.lC) {
			for (Volo volo: compagnia.getlV()) {
				if (data.equals(volo.getOrarioPartenza()) && !volo.getImbarco()) {
					listaRitorno.add(volo);
				}
			}
		}
		return listaRitorno;		
	}
	
    //prenota
	public boolean prenota(Compagnia compagnia, Volo volo, int numero_posti) {
		if (this.lC.contains(compagnia) && compagnia.getlV().contains(volo)) {
			if (volo.addPasseggeri(numero_posti)) {
				System.out.println("Posti prenotati");
				return true;
			}
		}
		System.out.println("Errore nella prenotazione");
		return false;
	}
	
    //cancella
	public boolean cancella(Compagnia compagnia, Volo volo, int numero_posti) {
		if (this.lC.contains(compagnia) && compagnia.getlV().contains(volo)) {
			if (volo.removePassegeri(numero_posti)) {
				System.out.println("Posti prenotati");
				return true;
			}
		}
		System.out.println("Errore nella prenotazione");
		return false;
	}

}