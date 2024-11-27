import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Util {
	private static Random rng = new Random();
	private static String alfa = "abcdefghijklmnopqrstuvwxyz";
	private static String digit = "0123456789";
	private static String simboli = "-_.:;!?|$%";
	
	public static String getRandomAuthProtocol() {
		int n = rng.nextInt(4);
		String [] vp = new String[] {"WEP","WPA","WPA2","WPA3"};
		return vp[n];
	}
	
	public static Double getFrequenza() {
		Double d = rng.nextDouble(1.0*Math.pow(10, 9), 5.0*Math.pow(10, 9));
		return d;
	}
	
	public static String getPassword(Boolean isPassword) {
		String all = alfa + alfa.toUpperCase()+digit;
		if (isPassword) {
			all += simboli;
		}
		int n = rng.nextInt(12,25);
		String ret = "";
		for (int i=0; i<n; i++) {
			ret += all.charAt(rng.nextInt(all.length()));
		}
		return ret;
	}
	
	public static BufferedReader OpenFileForReading(String nomeFile) {

		 try {

		 BufferedReader reader = Files.newBufferedReader(Path.of(nomeFile));

		 return reader;

		 } catch (IOException e) {

		 return null;

		 }

		 }
	
	public static BufferedWriter OpenFileForWriting(String nomeFile) {
        try {
            Path path = Path.of(nomeFile);
            BufferedWriter writer = Files.newBufferedWriter(
                    path,
                    Files.exists(path)?StandardOpenOption.TRUNCATE_EXISTING:StandardOpenOption.CREATE);
            return writer;
        } catch (Exception ex) {
            return null;
        }
    }
    public static BufferedWriter OpenFileForAppend(String nomeFile) {
        try {
            BufferedWriter writer = Files.newBufferedWriter(
                    Path.of(nomeFile),
                    StandardOpenOption.APPEND);
            return writer;
        } catch (Exception ex) {
            return null;
        }
    }
}
