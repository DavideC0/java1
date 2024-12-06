import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int lunghezza = 5 * 2;
        Random random = new Random();

        for (int i = 0; i < lunghezza; i++) {
            StringBuilder riga = new StringBuilder(" ".repeat(lunghezza - i) + "/");
            for (int j = 0; j < i * 2; j++) {
                if (random.nextInt(5) == 0) { 
                    riga.append("@");
                } else {
                    riga.append("—");
                }
            }
            riga.append("\\");
            System.out.println(riga);
        }

        for (int i = 0; i < lunghezza / 2 - 1; i++) {
            System.out.println(" ".repeat(lunghezza - 1) + "|  |" + " ".repeat(lunghezza - 4));
        }
    }
}