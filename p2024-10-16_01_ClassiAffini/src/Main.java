
public class Main {

	public static void main(String[] args) {
		Autoveicolo auto1 = new Autoveicolo(1600, 7.5, 50.0, "Rosso", (float) 20000.00);
        Autoveicolo auto2 = new Autoveicolo(2000, 6.0, 60.0, "Blu", (float) 25000.0);
        
        double distanza = auto1.calcolaDistanza(50, 3);
        
        System.out.println("La distanza percorsa in 3 ore dalla prima auto che va a 50km/h è: " + distanza + "km");
        
        distanza = auto2.calcolaDistanza(50, 11);
        
        System.out.println("La distanza percorsa in 11 ore dalla seconda auto che va a 50km/h è: " + distanza  + "km");

	}

}
