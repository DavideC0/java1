import java.util.*;

public class Main {

	public static void main(String[] args) {
		Random rng = new Random();
		Queue<Integer> qi = new LinkedList<Integer>();
		qi.add(9);
		qi.add(8);
		qi.add(11);
		qi.add(3);
		System.out.println(qi.poll());
		System.out.println(qi.poll());
		while (rng.nextInt(0,100) > 5) {
			qi.add(rng.nextInt(0,1000));
		}
		
		while (!qi.isEmpty()) {
			System.out.println(qi.poll());
		}
		
		while (rng.nextInt(0,100) > 50) {
			qi.add(rng.nextInt(0,1000));
		}
		
		for (var x: qi) {
			System.out.println(x);
		}
		
		Iterator<Integer> it = qi.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(vai(10));
		
		Stack<Integer> si = new Stack<Integer>();
		
		si.push(100);
		si.push(110);
		si.push(20);
		si.push(30);
		System.out.println(si.pop());
	}
	private static double ok(int i) {
		double a = Math.pow(i, 12);
		return a;
	}
	
	private static double vai(int i) {
		double b = ok(i);
		System.out.println(b);
		return b;
	}

}
