
public class Main {

	public static void main(String[] args) {
		Cibo[] portate = new Cibo[5];
		double calorie_tot = 0;
		for (int i=0; i<portate.length; i++) {
			portate[i] = (Cibo)ParseClass.Parse("Cibo");
			System.out.println(portate[i]);
			calorie_tot += portate[i].getCalorie();
		}
		System.out.println("Calorie totali: " + calorie_tot);
		for (int i=0; i<50; i++) {
			System.out.println("La persona numero " + (i+1) + " ha questo menù:");
			for (int j=0; j<3; j++) {
				System.out.println((j+1) + ") " + portate[(int)(Math.random()*5)]);
			}
		}
	}

}
