package CH_05;

public class Exch5_20 {
    public static boolean isPrime(int n) {
        int d = 2;
        boolean notPrime = false;
        while (d<Math.sqrt(n)) {
            if (n % d == 0) {
                notPrime = true;
                break;
            }
            d++;
        }
        return !notPrime;
    }
    public static void main(String[] args) {
        int nextLineCount = 8;
        for (int i = 2; i <= 1000; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
                --nextLineCount;
                if (nextLineCount == 0) {
                    System.out.println();
                    nextLineCount = 8;
                }
            }
        }
    }
}
