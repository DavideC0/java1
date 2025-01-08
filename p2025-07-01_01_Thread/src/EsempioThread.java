
public class EsempioThread extends Thread{
	private int n1;
	private int n2;
	
	public EsempioThread(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public void run() {
		Numeri num = Numeri.CreaCoppia(n1, n2);
		System.out.println(num);
	}
}
