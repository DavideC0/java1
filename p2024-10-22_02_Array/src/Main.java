
public class Main {

	public static void main(String[] args) {
		int[] vint = new int[100];
		for (int i=0; i<100; i++) {
			vint[i] = i;
			vint[i] = vint[i] * 2 + 1;
		}
		for (int i=0; i<100; i++) {
			vint[i] = 2 * (i+1) * 2 * (i+1);
		}
		vint[0] = 1;
		vint[1] = 1;
		for (int i=2; i<100; i ++) {
			vint[i] = vint[i-1] + vint[i-2];
			
		}
		double[] vdou = new double[100];

		for (int i=0; i<100; i++) {
			vdou[i] = 1.0/(i+1);
		}
		for (int i=0; i<100; i++) {
			vdou[i] = Math.sin(i*Math.PI*2/360);
		}
		
		for (int i=1; i<101; i++) {
			vdou[i-1] = Math.log(i)/Math.log(2.0);
		}
		for (double v: vdou) {
			System.out.println(v+" ");
		}
		
	}

}
