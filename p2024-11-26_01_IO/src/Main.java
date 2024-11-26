import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Wifi> setWifi = new HashSet<Wifi>();
		
		for (int i=0; i<128; i++) {
			setWifi.add(Wifi.MakeWifi());
		}
		BufferedWriter w = Util.OpenFileForWriting("pippo.txt");
		try {
			w.write("Ei fu, siccome immobile");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedWriter a = Util.OpenFileForAppend("pippo.txt");
		try {
			a.write("\n«La vispa Teresa\n"
					+ "avea tra l'erbetta\n"
					+ "Al volo sorpresa\n"
					+ "gentil farfalletta\n"
					+ "E tutta giuliva\n"
					+ "stringendola viva\n"
					+ "gridava a distesa:\n"
					+ "“L'ho presa! L'ho presa!”.\n"
					+ "");
			a.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Integer n_int = 4;
		Float n_float = 4.43f;
		Long n_long = 1000000000000L;
		
		a = Util.OpenFileForWriting("pippo1.txt");
		try {
			a.write(Integer.toString(n_int)+ "\n");
			a.write(Float.toString(n_float)+ "\n");
			a.write(Long.toString(n_long)+ "\n");
			a.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader r = Util.OpenFileForReading("pippo1.txt");
		String riga;
		try {
			while ((riga = r.readLine()) != null) {
				System.out.println(riga);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
