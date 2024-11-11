
public class Biglietteria {
	Compagnia c1;
	Compagnia c2;
	public Biglietteria(Compagnia c1, Compagnia c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}
	public Compagnia getC1() {
		return c1;
	}
	public void setC1(Compagnia c1) {
		this.c1 = c1;
	}
	public Compagnia getC2() {
		return c2;
	}
	public void setC2(Compagnia c2) {
		this.c2 = c2;
	}
	@Override
	public String toString() {
		return "[c1=" + c1 + "\nc2=" + c2 + "]";
	}
	
}
