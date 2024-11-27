import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Set<Wifi> setWifi = new HashSet<Wifi>();
		
		for (int i=0; i<5; i++) {
			setWifi.add(Wifi.MakeWifi());
		}
		BufferedWriter writer = Util.OpenFileForWriting("wifi.csv");
		try {
			for (Wifi wf: setWifi) {
				writer.write(wf.toString());
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		BufferedReader reader = Util.OpenFileForReading("wifi.csv");
		
		String riga;
		Set<Wifi> new_setWifi = new HashSet<Wifi>();
		try {
			while ((riga = reader.readLine()) != null) {
				String[] array_righe = riga.split(",");
				Wifi wifi = new Wifi(Double.parseDouble(array_righe[0]), array_righe[1], array_righe[2], array_righe[2]);
				new_setWifi.add(wifi);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ObjectMapper objectMapper = new ObjectMapper();
		Wifi wi = Wifi.MakeWifi();
		String jsonString = "";
		try {
			jsonString = objectMapper.writeValueAsString(wi);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Wifi wi2 = objectMapper.readValue(jsonString, Wifi.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter bw2 = Util.OpenFileForWriting("wifi2.json");
		Set<Wifi> terzoSet = new HashSet<Wifi>();
		String jsonString2 = "";
		try {
			for (Wifi s: setWifi) {
				jsonString2 = objectMapper.writeValueAsString(s);
				bw2.write(jsonString2 + "\n");
			}
			bw2.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		BufferedReader br2 = Util.OpenFileForReading("wifi2.json");
		riga = "";
		Set<Wifi> new_setWifi2 = new HashSet<Wifi>();
		try {
			while ((riga = br2.readLine()) != null) {
				Wifi s = objectMapper.readValue(riga, Wifi.class);
				new_setWifi2.add(s);
			}
			br2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(new_setWifi2);
		
		
		if (false) {
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
				e.printStackTrace();
			}
			
			BufferedReader r = Util.OpenFileForReading("pippo1.txt");
			String riga1;
			try {
				while ((riga1 = r.readLine()) != null) {
					System.out.println(riga1);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}