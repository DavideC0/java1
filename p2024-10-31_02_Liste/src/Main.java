import java.util.Scanner;

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
		Scanner input = new Scanner(System.in);
		Boolean ciclo = true;
		while (ciclo) {
			System.out.println("1)Prenota un posto in un aereo");
			System.out.println("2)Libera un posto in un aereo");
			System.out.println("3)Stampa lo stato attuale");
			System.out.println("4)Esci");
			System.out.println("Cosa vuoi fare?");
			int scelta = input.nextInt();
			switch (scelta) {
			case 1:
				System.out.println("Inserisci per quale compagnia vuoi prenotare 0 = Alitalia 1 = MagicFly");
				int comp = input.nextInt();
				System.out.println("Inserisci quale aereo vuoi prendere 0/1");
				int aer = input.nextInt();
				if (0 <= comp && comp < 2 && 0 <= aer && aer < 2) {
					if (comp == 0) {
						if (b1.getC1().prenota(aer)) {
							System.out.println("Prenotazione avvenuta con successo");
						} else {
							System.out.println("Prenotazione non avvenuta per mancanza di posti dispobibili");
						}
					} else {
						if (b1.getC2().prenota(aer)) {
							System.out.println("Prenotazione avvenuta con successo");
						} else {
							System.out.println("Prenotazione non avvenuta per mancanza di posti dispobibili");
						}
					}
				} else {
					System.out.println("Errore nei dati inseriti");
				}
				break;
			case 2:
				System.out.println("Inserisci per quale compagnia vuoi liberare un posto 0 = Alitalia 1 = MagicFly");
				int comp1 = input.nextInt();
				System.out.println("Inserisci quale aereo vuoi liberare 0/1");
				int aer1 = input.nextInt();
				if (0 <= comp1 && comp1 < 2 && 0 <= aer1 && aer1 < 2) {
					if (comp1 == 0) {
						if (b1.getC1().liberaPosto(aer1)) {
							System.out.println("Liberazione posto avvenuta con successo");
						} else {
							System.out.println("Liberazione posto non avvenuta perchè i posti sono già tutti disponibili");
						}
					} else {
						if (b1.getC2().liberaPosto(aer1)) {
							System.out.println("Liberazione posto avvenuta con successo");
						} else {
							System.out.println("Liberazione posto non avvenuta perchè i posti sono già tutti disponibili");
						}
					}
				} else {
					System.out.println("Errore nei dati inseriti");
				}
				break;
			case 3:
				System.out.println("Stato corrente:\n" + b1);
				break;
			case 4:
				System.out.println("Termine programma in corso...");
				ciclo = false;
				break;
			default:
				System.out.println("Operazione inesistente");
			}
		}
		input.close();
		System.out.println("Stato finale:\n" + b1);
	}

}
