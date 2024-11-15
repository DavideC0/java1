import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, 0);
		hm.put(1, 1);
		int count=10;   
		 System.out.print(hm.get(0)+" "+hm.get(1));//printing 0 and 1    
		    
		 for(int i=2;i<count;++i){
			 hm.put(i, hm.get(i-1)+hm.get(i-2));
			 System.out.print(" " + hm.get(i));    
		 }  
	}

}
