
public class Pitagora {

	public static void main(String[] args) {
		double c1 = 10.345;
		double c2 = 20.415;
		double ipotenusa = Math.sqrt(c1*c1+c2*c2);
		double perimetro = c1 + c2 + ipotenusa;
		double area = c1 * c2;
		System.out.println("Cateto 1: " + c1 + "Cateto 2: " + c2 + "Ipotenusa: " + ipotenusa);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
	}

}
