package CH_05;

public class Exch5_10 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 100; i <= 1000; i++) {

            if (cnt == 10) {
                System.out.println();
                cnt = 0;
            }

            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                cnt++;
            }

        }
    }
}
