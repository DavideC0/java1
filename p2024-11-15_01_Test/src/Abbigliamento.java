
public class Abbigliamento extends Prodotto {

	public Abbigliamento(String name, Double price, String categoria) {
		super(name, price, categoria);
	}
	@Override
	public double calculateDiscount() {
		if (getCategoria().equals("Abbigliamento invernale")) {
			return getPrice()*0.85;
		} else {
			return getPrice();
		}
			
	}
}
