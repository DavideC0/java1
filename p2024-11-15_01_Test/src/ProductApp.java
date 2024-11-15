
public class ProductApp {

	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		pm.addProduct(new Elettronica("Tastiera da gaming", 50.0, "gaming"));
		pm.addProduct(new Elettronica("Frigorifero", 699.99, "Grandi elettrodomestici"));
		pm.addProduct(new Abbigliamento("Cappotto Pima", 999.99, "Abbigliamento invernale"));
		pm.addProduct(new Abbigliamento("Mutande", 7.50, "Intimo"));
		pm.sortByPrice();
		pm.displayProducts();
	}

}
