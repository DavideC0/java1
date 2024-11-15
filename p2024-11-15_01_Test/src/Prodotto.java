
public abstract class Prodotto implements Comparable<Prodotto> {
	private String name;
	private Double price;
	private String categoria;
	public Prodotto(String name, Double price, String categoria) {
		super();
		this.name = name;
		this.price = price;
		this.categoria = categoria;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Prodotto [name=" + name + ", price=" + price + ", categoria=" + categoria + "]";
	}
	@Override
    public int compareTo(Prodotto p) {
        return price.compareTo(p.price);
    }
	public abstract double calculateDiscount();
	
}
