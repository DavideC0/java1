public class Main {

	public static void main(String[] args) {	
		Compagnia c1 = new Compagnia("Alitalia");
		Compagnia c2 = new Compagnia("MagicFly");
		Biglietteria b1 = new Biglietteria(c1, c2);
		//inserimento di aerei nella prima compagnia
		Aereo aereo = new Aereo("Boeing 747");
		b1.getC1().addAereo(aereo);
		aereo = new Aereo("Airbus A380");
		b1.getC1().addAereo(aereo);
		//inserimento di aerei nella seconda compagnia
		aereo = new Aereo("Boeing 737");
		b1.getC2().addAereo(aereo);
		aereo = new Aereo("Airbus A320");
		b1.getC2().addAereo(aereo);
		
		//prenotazione di un po' di posti, sotto il limite massimo, di un aereo della compagnia 1 aereo boeing 747
		System.out.println("Inserimento boeing 747");
		for (int i=0; i<5; i++) {
			Boolean ritorno = b1.getC1().prenota(0);
			if (ritorno) {
				System.out.println("Prenotazione avvenuta con successo");
			} else {
				System.out.println("Prenotazione non avvenuta per mancanza di posti dispobibili");
			}
		}
		//prenotazione di tutti i posti e oltre per test campagnia 2 aereo airbus A320
		System.out.println("Inserimento airbus A320");
		for (int i=0; i<15; i++) {
			if (b1.getC2().prenota(1)) {
				System.out.println("Prenotazione avvenuta con successo");
			} else {
				System.out.println("Prenotazione non avvenuta per mancanza di posti dispobibili");
			}
		}
		System.out.println(b1);
	}

}
