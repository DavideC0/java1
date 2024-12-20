import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Server extends Thread {
    public Socket socket;

    public Server(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        //Questa parte deve diventare un thread!
        System.out.println("New client connected");

        // Handle client in a separate thread
        try (
                // Estraggo il canale di ingresso
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                // Estraggo il canale di uscita
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true)) {

	            Comando cm = Comando.FromJSon(reader.readLine()); 
	            switch (cm.getCmd()) {
				case Comandi.e_Registrazione: {
					String jsonString = "{\"nome\":\"" + cm.getNome() + "\",\"badge\":" + cm.getBadge() + "}"; 
					BufferedWriter bw = Util.OpenFileForAppend("Dipendenti.json");
					bw.append(jsonString + "\n");
					bw.close();
					break;
				}
				case Comandi.e_Ingresso: {
					LocalDate data = LocalDate.now();
					String strData = data.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
					String jsonString = "{\"badge\":" + cm.getBadge() + "\"data\":\"" + strData + "\"\"orario\":\"" + cm.getOrario() + "\", \"tipo\":\"ingresso\"}"; 
					BufferedWriter bw = Util.OpenFileForAppend("Ingressi.json");
					bw.append(jsonString + "\n");
					bw.close();
					break;
				}
				case Comandi.e_Rientro: {
					String jsonString = "{\"badge\":" + cm.getBadge() + "\"orario\":\"" + cm.getOrario() + "\", \"tipo\":\"rientro\"}"; 
					BufferedWriter bw = Util.OpenFileForAppend("Ingressi.json");
					bw.append(jsonString + "\n");
					bw.close();
					break;
				}
				case Comandi.e_Uscita: {
					String jsonString = "{\"badge\":" + cm.getBadge() + "\"orario\":\"" + cm.getOrario() + "\", \"tipo\":\"uscita\"}"; 
					BufferedWriter bw = Util.OpenFileForAppend("Ingressi.json");
					bw.append(jsonString + "\n");
					bw.close();
					break;
				}
				case Comandi.e_Sospensione: {
					String jsonString = "{\"badge\":" + cm.getBadge() + "\"orario\":\"" + cm.getOrario() + "\", \"stato\":\"sospeso\"}"; 
					BufferedWriter bw = Util.OpenFileForAppend("statoBadge.json");
					bw.append(jsonString + "\n");
					bw.close();
					break;
				}
				case Comandi.e_Riattivazione: {
					String jsonString = "{\"badge\":" + cm.getBadge() + "\"orario\":\"" + cm.getOrario() + "\", \"stato\":\"attivo\"}"; 
					BufferedWriter bw = Util.OpenFileForAppend("statoBadge.json");
					bw.append(jsonString + "\n");
					bw.close();
					break;
				}
				case Comandi.e_Report: {
					BufferedReader br = Util.OpenFileForReading("Ingresso.json");
					String text1;
					String data = cm.getPeriodo();
					BufferedWriter bw = Util.OpenFileForAppend("report" + data + ".json");
					while ((text1 = br.readLine()) != null) {
						if (text1.contains(data) && text1.contains("ingresso")) {
							String[] s = text1.split(",");
							bw.append(s[0] + "\n");
						}
					}
					br.close();
					bw.close();
					br = Util.OpenFileForReading("report" + data + ".json");
					String riga;
					while ((riga = br.readLine()) != null) {
						writer.println(riga);
					}
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + cm.getCmd());
				}
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
public class SocketServer {
    public void Server(int port) {
        // int port = 12345; // Port number

        try (ServerSocket serverSocket = new ServerSocket(port)) {

            // con questa set il server potrà essere rimesso in
            // esecuzione anche immediatamente dopo la sua terminazione
            serverSocket.setReuseAddress(true);

            // Creo il socket sul quale sarò in "ascolto"
            System.out.println("Server is listening on port " + port);

            // resta in attesa finché un "client" chiederà di collegarsi
            while (true) {
                Socket socket = serverSocket.accept();

                //Qui devo far partire il thread
                //Come faccio a fare la start del thread?
                Server srv = new Server(socket);
                srv.start();
            }
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
