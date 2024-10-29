import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		String esempio = " 123 / 876 ";
		esempio = esempio.replaceAll(" ", "");
		System.out.println(esempio);
		
		String[] operandi = esempio.split("[\\+\\-\\*\\/]");
		String[] operatore = esempio.split("[0-9]+");
		for (String s:operandi) {
			System.out.println(s);
		}
		for (String s:operatore) {
			System.out.println(s);
		}
		
		if (operatore[1].equals("+")) {
			int result = Integer.parseInt(operandi[0]) + Integer.parseInt(operandi[1]);
			System.out.println(result);
		} else if (operatore[1].equals("-")) {
			int result = Integer.parseInt(operandi[0]) - Integer.parseInt(operandi[1]);
			System.out.println(result);
		} else if (operatore[1].equals("*")) {
			int result = Integer.parseInt(operandi[0]) * Integer.parseInt(operandi[1]);
			System.out.println(result);
		} else if (operatore[1].equals("/")) {
			float result = Float.parseFloat(operandi[0]) / Float.parseFloat(operandi[1]);
			System.out.println(result);
		} else {
			System.out.println("errore");
		}
		

		esempio = "4+5*2+1";
		esempio = esempio.replaceAll(" ", "");
		String[] operandi1 = esempio.split("[\\+\\-\\*\\/]");
		String[] operatore1 = esempio.split("[0-9]+");
		ArrayList<String> operazioni = new ArrayList<String>();
		for (int i=0; i < operandi1.length; i++) {
			operazioni.add(operandi1[i]);
			if (i < operandi1.length - 1) {
				operazioni.add(operatore1[i+1]);
			}
		}
		System.out.println(operazioni);
		while (operazioni.size()>1) {
			if (operazioni.get(1).equals("+")) {	
				operazioni.set(2, Float.toString(Float.parseFloat(operazioni.get(0)) + Float.parseFloat(operazioni.get(2))));
				operazioni.remove(0);
				operazioni.remove(0);
				System.out.println(operazioni.get(0));
			} else if (operazioni.get(1).equals("-")) {
				operazioni.set(2, Float.toString(Float.parseFloat(operazioni.get(0)) - Float.parseFloat(operazioni.get(2))));
				operazioni.remove(0);
				operazioni.remove(0);
				System.out.println(operazioni.get(0));
			} else if (operazioni.get(1).equals("*")) {
				operazioni.set(2, Float.toString(Float.parseFloat(operazioni.get(0)) * Float.parseFloat(operazioni.get(2))));
				operazioni.remove(0);
				operazioni.remove(0);
				System.out.println(operazioni.get(0));
			} else if (operazioni.get(1).equals("/")) {
				operazioni.set(2, Float.toString(Float.parseFloat(operazioni.get(0)) / Float.parseFloat(operazioni.get(2))));
				operazioni.remove(0);
				operazioni.remove(0);
				System.out.println(operazioni.get(0));
			} else {
				System.out.println("errore");
			}
		}
	}
}
