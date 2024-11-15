import java.util.*;

public class Main {

	public static void main(String[] args) {
		//ho essenzialmente due tipi di liste in Java
		// LinkedList, ArrayList
		LinkedList<Integer> li; //un oggetto non inizializzato in java vale null
		li = new LinkedList<Integer>();
		//appendi in fondo
		li.add(7);
		li.add(2);
		li.add(70);
		li.add(30);
		//primo elem di una lista
		System.out.println(li.getFirst());
		//ultimo elem
		System.out.println(li.getLast());
		//elem i 
		System.out.println(li.get(2));
		//in ogni caso, posso scorrere tutta la lista di metodi suggerita da eclipse
		//per stampare tutti gli elementi di una linked list:
		for(Integer i: li) {
			System.out.println(i + " ");
		}
		for (var i: li) {
			System.out.println(i + " ");
		}
		//per stampare al contrario:
		Collections.reverse(li); //è un metodo statico: non devo istanziare un oggetto
		System.out.println(li);
		//disordinare
		Collections.shuffle(li);
		System.out.println(li);
		//ordinare
		Collections.sort(li);
		System.out.println(li);
		
		
		Citta roma = new Citta("Roma", 0.0, 0.0, 3578922);
		LinkedList<Citta> lc = new LinkedList<Citta>();
		lc.add(roma);
		lc.add(new Citta("Milano", 1.0, 1.0, 1500000));
		lc.add(new Citta("Firenze", 1.0, 1.0, 750000));
		System.out.println(lc);
		Collections.sort(lc);
		System.out.println(lc);
		Collections.shuffle(li);
		lc.sort(new Comparator<Citta>() {
			@Override
			public int compare(Citta o1, Citta o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		
		Pair<String> ps = new Pair<String>("uno", "due");
		Pair<Integer> pi = new Pair<Integer>(10,  20);
		
		var l3int = CreaLista3(10, 20, 30);
		var l3str = CreaLista3("uno", "due", "tre");
		System.out.println(l3int);
		System.out.println(l3str);
	}
	
	/*public static List<Integer> CreaLista3(Integer i1, Integer i2, Integer i3){
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(i1);
		li.add(i2);
		li.add(i3);
		return li;
	}
	*/
	
	public static <T> List<T> CreaLista3(T i1, T i2, T i3){
		LinkedList<T> li = new LinkedList<T>();
		li.add(i1);
		li.add(i2);
		li.add(i3);
		return li;
	}
	
	public static void Hanoi(int n, String p1, String p2, String p3) {
		//Si parte con n dischi sul paletto p1
		//La soluzione è spostare tutto sul paletto p2
		if (n<=0) {
			System.out.println("Il problema richiede un numero di dischi almeno pari a 1");
			return;
		}
		if (n==1) {
			System.out.printf("Sposta da %s a %s \n", p1, p2);
			return;
		}
		if (n==2) {
			System.out.printf("Sposta da %s a %s \n", p1, p3);
			Hanoi(n-1, p1, p2, p3);
			Hanoi(n-1, p3, p2, p1);
			return;
		}
		if (n%2==1) {
			Hanoi(n-1, p1, p3, p2);
			System.out.printf("Sposta da %s a %s \n", p1, p2);
			Hanoi(n-1, p3, p2, p1);
		} else {
			Hanoi(n-1, p1, p2, p3);
			System.out.printf("Sposta da %s a %s \n", p1, p2);
			Hanoi(n-1, p2, p3, p1);
		}
	}
	
}
