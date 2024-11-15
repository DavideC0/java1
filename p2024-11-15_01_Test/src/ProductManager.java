import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager implements Ordinabile {
	 	private List<Prodotto> products;

	    public ProductManager() {
	        products = new ArrayList<>();
	    }

	    public void addProduct(Prodotto product) {
	        products.add(product);
	    }

	    public void displayProducts() {
	        for (Prodotto product : products) {
	            System.out.println(product);
	        }
	    }
	    @Override
	    public List<Prodotto> sortByPrice() {
	        products.sort(new Comparator<Prodotto>() {
	            public int compare(Prodotto p1, Prodotto p2) {
	                return p1.getPrice().compareTo(p2.getPrice());
	            }
	        });
	        return products;
	    }
}
