import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		VerificatoreParola v = (x,y) -> x.length() > y;
		boolean result = v.verifica("prova", 10);
		System.out.println(result);
		
		CalcolatoreArea c = (x) -> Math.PI*x*Math.PI*x;
		double resultArea = c.calcola(4);
		System.out.println(resultArea);
		
		VerificatoreNumero vn = (x) -> x>0;
		result = vn.verifica(4);
		System.out.println(result);
		
		ConcatenaStringhe cs = (x,y) -> x+y;
		String resultString = cs.concatena("Stringa 1", "Stringa 2");
		System.out.println(resultString);
		
		evenCheck ev = (x) -> x%2==0;
		result = ev.verifica(4);
		System.out.println(result);
		
		Sommatore s = (x) -> {
			int somma = 0;
			for (int m: x) {
				somma += m;
			}
			return somma;
		};
		List<Integer> numeri = new ArrayList<Integer>();
		numeri.add(1);
		numeri.add(2);
		numeri.add(3);
		int resultInt = s.somma(numeri);
		System.out.println(resultInt);
		
			VericatorePalindromo vp = (x) -> {
			String originalStr = x;
			String reversedStr = "";

			for (int i = 0; i < originalStr.length(); i++) {
			  reversedStr = originalStr.charAt(i) + reversedStr;
			}
			return originalStr.equals(reversedStr);
		};
		result = vp.verifica("()(");
		System.out.println(result);
		
	}
	
	@FunctionalInterface
	interface VerificatoreParola {
		boolean verifica(String parola, int lunghezza);
	}
	
	@FunctionalInterface
	interface CalcolatoreArea {
        double calcola(double raggio);
	}
	
	@FunctionalInterface
	interface VerificatoreNumero {
	    boolean verifica(int numero);
	}
	
	@FunctionalInterface
	interface ConcatenaStringhe {
		String concatena(String s1, String s2);
	}
	
	@FunctionalInterface
	interface evenCheck {
		boolean verifica(int numero);
	}
	
	@FunctionalInterface
	interface Sommatore {
	    int somma(List<Integer> lista);
	}
	
	@FunctionalInterface
	interface VericatorePalindromo {
		boolean verifica(String s);
	}
}
