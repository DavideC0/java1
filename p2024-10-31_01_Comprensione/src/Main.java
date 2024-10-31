class Pair{
	    int value;
	    Pair left;
	    Pair right;
		public Pair(int value) {
	        super();
	        this.value = value;
	    }
		@Override
		public String toString() {
			return "Pair [value=" + value + ", left=" + left + ", right=" + right + "]";
		}
	}

public class Main {
	
	public static void main(String[] args) {
		Pair r=new Pair(10);
        r.left=new Pair(5);
        r.right=new Pair(20);

        r.left.left = new Pair(2);
        r.left.right = new Pair(7);
        r.left.left.left = new Pair(1);
        r.left.right.left = new Pair(6);
        r.left.right.right= new Pair(8);

        r.right.left = new Pair(15);
        r.right.right = new Pair(45);

        r.right.left.left = new Pair(13);
        r.right.left.right = new Pair(18);

        System.out.println(r);

	}

}
