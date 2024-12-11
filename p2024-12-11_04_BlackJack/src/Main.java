import java.util.*;

public class Main {
	static Queue<Integer> mazzo_completo = new LinkedList<Integer>();
	public static void main(String[] args) {
		for (int i=0; i<13; i++) {
			for (int j=0; j<4; j++) {
				Main.mazzo_completo.add(i+1);
			}
		}
		Queue<Integer> mazzo_usato = new LinkedList<Integer>();
		mazzo_usato.addAll(mazzo_completo);
		Collections.shuffle((List<?>) mazzo_usato);
		//inserire qua il pool per il banco
		while (true) {
			//inserire istruzioni per il pool del giocatore
		}

	}

}
