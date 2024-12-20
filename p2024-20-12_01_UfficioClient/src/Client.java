import java.io.*;
import java.net.*;

public class Client {
    public void run(int port) {
        String hostname = "localhost";

        try (Socket socket = new Socket(hostname, port);
             OutputStream output = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(output, true);
             InputStream input = socket.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {

            System.out.println("Connected to the server");
            //OKAY
            
            /*e_Registrazione,
            e_Ingresso,
            e_Rientro,
            e_Uscita,
            e_Sospensione,
            e_Riattivazione,
            e_Report
            */
            
            // Sending messages to the server
            // printa menu
            System.out.println(" 1. Registrazione \n 2. Ingresso \n 3. Rientro \n 4. Uscita \n 5. Sospensione \n 6. Riattivazione \n 7. Report");
            // leggi operazione da svolgere
            String response = reader.readLine();
            Comandi a = null;
            String nome;
            Integer badge;
            String orario;
            String periodo;
            if (response == "1") {
            	a = Comandi.e_Registrazione;
            } else if (response == "2") {
            	a = Comandi.e_Ingresso;
            } else if (response == "3") {
            	a = Comandi.e_Rientro;
            } else if (response == "4") {
            	a = Comandi.e_Uscita;
            } else if (response == "5") {
            	a = Comandi.e_Sospensione;
            } else if (response == "6") {
            	a = Comandi.e_Riattivazione;
            } else if (response == "7") {
            	a = Comandi.e_Report;
            }; 
            System.out.println("Inserisci nome: ");
            nome = reader.readLine();
            System.out.println("Inserisci badge: "); 
            String leggibadge = reader.readLine();
            badge = Integer.parseInt(leggibadge);
            System.out.println("Inserisci orario: ");
            orario = reader.readLine();
            System.out.println("Inserisci periodo (format: yyyy-mm-dd): ");
            periodo = reader.readLine();
            Comando cmd = new Comando(a, nome, badge, orario, periodo);
            String jsoncmd = cmd.toJSon();
            System.out.println(jsoncmd);

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}