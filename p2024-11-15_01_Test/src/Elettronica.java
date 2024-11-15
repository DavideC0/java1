
public class Elettronica extends Prodotto {
	

	public Elettronica(String name, Double price, String categoria) {
		super(name, price, categoria);
	}

	@Override
	public double calculateDiscount() {
		if (getPrice()>500) {
			return getPrice()*0.90;
		} else {
			return getPrice();
		}
	}
	
	
}
