import java.time.LocalDateTime;

public class Volo {
    private final String id;
    private String partenza;
    private String arrivo;
    private Integer postitot;
    private int postiDisponibili;
    private final String compagnia;
    private Boolean imbarco;
    private LocalDateTime orarioPartenza;
    private LocalDateTime orarioArrivo;
	public Volo(String id, String partenza, String arrivo, Integer postitot, String compagnia,
			Boolean imbarco, LocalDateTime orarioPartenza, LocalDateTime orarioArrivo) {
		super();
		this.id = id;
		this.partenza = partenza;
		this.arrivo = arrivo;
		this.postitot = postitot;
		this.postiDisponibili = postitot;
		this.compagnia = compagnia;
		this.imbarco = imbarco;
		this.orarioPartenza = orarioPartenza;
		this.orarioArrivo = orarioArrivo;
	}
	public String getPartenza() {
		return partenza;
	}
	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}
	public String getArrivo() {
		return arrivo;
	}
	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
	}
	public Integer getPostitot() {
		return postitot;
	}
	public void setPostitot(Integer postitot) {
		this.postitot = postitot;
	}
	public int getPostiDisponibili() {
		return postiDisponibili;
	}
	public void setPostiDisponibili(int postiDisponibili) {
		this.postiDisponibili = postiDisponibili;
	}
	public Boolean getImbarco() {
		return imbarco;
	}
	public void setImbarco(Boolean imbarco) {
		this.imbarco = imbarco;
	}
	public LocalDateTime getOrarioPartenza() {
		return orarioPartenza;
	}
	public void setOrarioPartenza(LocalDateTime orarioPartenza) {
		this.orarioPartenza = orarioPartenza;
	}
	public LocalDateTime getOrarioArrivo() {
		return orarioArrivo;
	}
	public void setOrarioArrivo(LocalDateTime orarioArrivo) {
		this.orarioArrivo = orarioArrivo;
	}
	public String getId() {
		return id;
	}
	public String getCompagnia() {
		return compagnia;
	}
	@Override
	public String toString() {
		return "Volo [id=" + id + ", partenza=" + partenza + ", arrivo=" + arrivo + ", postitot=" + postitot
				+ ", postiDisponibili=" + postiDisponibili + ", compagnia=" + compagnia + ", imbarco=" + imbarco
				+ ", orarioPartenza=" + orarioPartenza + ", orarioArrivo=" + orarioArrivo + "]";
	}
	
	public boolean addPasseggeri(int n) {
		if (n<= this.postiDisponibili && !this.imbarco) {
			this.postiDisponibili -= n;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removePassegeri(int n) {
		if (n <= (this.postitot - this.postiDisponibili) && !this.imbarco) {
			this.postiDisponibili += n;
			return true;
		} else {
			return false;
		}
	}
    
}