
public class CreaMazzo extends Thread {
	public void run() {
		for (int i=0; i<13; i++) {
			for (int j=0; j<4; j++) {
				Main.mazzo_completo.add(i+1);
			}
		}
	}
}
