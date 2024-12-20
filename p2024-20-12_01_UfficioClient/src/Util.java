import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Util {

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
