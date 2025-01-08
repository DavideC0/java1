import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class ContoCorrente {

	 public double getSaldo() {

		 double saldo = 0;
		 BufferedReader br = null;

		 try {

			 br = Util.OpenFileForReading("db.txt");
	
			 String line = br.readLine();
			 saldo = Double.parseDouble(line);
			 br.close();
			 
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

		 return saldo;

		 }
	 
	 public void setSaldo(double amount) {
		 amount = getSaldo() - amount;
		 try {
			 BufferedWriter bw = Util.OpenFileForWriting("db.txt");
			 bw.write(Double.toString(amount));
			 bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }

}
