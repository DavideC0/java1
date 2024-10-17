
public class Main {

	public static void main(String[] args) {
		int[] v;
		v = new int[100];
		for (int i=0; i<100; i++) {
			v[i] = (int)(Math.random()*1000);
		}
		double[] d;
		d = new double[1000];
		int counter = 0;
		double somma = 0;
		int seq1 = 0, seq2 = 0;
		int counter_maggiori = 0;
		for (int i=0; i<1000; i++) {
			d[i] = (double)(Math.random()*100);
			if (d[i] >= 50) {
				counter++;
			}
			somma = somma + d[i];
		}
		for (int i=0; i<1000; i++) {
			if (i!=999) {
				if (d[i] < d[i+1]) {
					counter_maggiori++;
				}
			}
		}
		for (int i=1; i<1000; i++) {
			if (d[i] > d[i-1]) {
				seq2++;
			} else {
				if (seq2 > seq1) {
					seq1 = seq2;
					seq2 = 0;
				} else {
					seq2 = 0;
				}
			}
		}
		double media = somma / 1000;
		System.out.println(counter);
		System.out.println("La somma è: " + somma + " La media è: " + media + " Volte in cui il numero successivo è maggiore del precedente: " + counter_maggiori);
		System.out.println("La sequenza più lunga è: " + seq1);
	}
}
