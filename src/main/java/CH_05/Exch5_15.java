package CH_05;

public class Exch5_15 {
    public static void main(String[] args) {
        int start = '!';
        int end = '~';

        for (int i = start, j = 1; i <= end; i++, j++) {
            if (j % 10 == 0) {
                System.out.println();
            }
            System.out.print((char) i);
        }
    }
}
