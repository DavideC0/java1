import java.util.Scanner;

public class Cicli {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		for (int i=0; i<=70; i+=7) {
			System.out.println(i);
		}
		
		for (int i=0; i<=10; i++) {
			System.out.println(i*7);
		}
		
		for (int i=0; i<=70; i++) {
			if (i%7==0) {
				System.out.println(i);
			}
		}
		
		int a = 6;
		if (a%2==0) {
			System.out.println("Il numero è pari");
		} else {
			System.out.println("Il numero è dispari");
		}
		
		Scanner input = new Scanner(System.in);
		for (int i=0; i<10; i++) {
			System.out.println((i+1) + " Inserisci un numero");
			int n = input.nextInt();
			if (n>10) {
				System.out.println("Il numero è maggiore di 10");
			} else {
				System.out.println("Il numero è minore di 10");
			}
		}
		 
		input.close();
	}

}
