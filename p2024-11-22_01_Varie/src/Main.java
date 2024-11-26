import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Supponiamo di avere due liste di interi
        LinkedList<Integer> li1 = new LinkedList<Integer>();
        LinkedList<Integer> li2 = new LinkedList<Integer>();
        Random rnd = new Random();

        for (int i=0; i<4; i++) {
            li1.add(rnd.nextInt(0,100));
            li2.add(rnd.nextInt(0,100));
        }

        System.out.println(li1);
        System.out.println(li2);
        
        
        Iterator<Integer> ili1 = li1.iterator();
        Iterator<Integer> ili2 = li2.iterator();
        
        while (ili1.hasNext() && ili2.hasNext()) {
        	System.out.println(ili1.next() + ", " + ili2.next());
        }

	}

}
