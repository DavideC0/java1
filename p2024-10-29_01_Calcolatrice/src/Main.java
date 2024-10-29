
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
		
		esempio = "4+5*2-1";
		esempio = esempio.replaceAll(" ", "");
		String[] operandi1 = esempio.split("[\\+\\-\\*\\/]");
		String[] operatore1 = esempio.split("[0-9]+");
		for (String s:operandi1) {
			System.out.println(s);
		}
		for (String s:operatore1) {
			System.out.println(s);
		}
		while (operandi1 != null) {
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
		}
	}

}
