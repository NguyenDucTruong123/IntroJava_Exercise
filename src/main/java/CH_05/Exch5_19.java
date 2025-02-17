package CH_05;

import java.util.Scanner;

public class Exch5_19 {
    public static void main(String[] args) {
        int z = 7;
        int a = 0;
        for (int Lines = 1; Lines <= 128 ; Lines+=Lines){
            for (int s = 0; s < z; s++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= Lines; j+=j) {
                System.out.printf("%4d", j);
            }
            for (int x = a; x > 0; x /= 2) {
                System.out.printf("%4d", (x));
            }
            a = Lines;
            --z;
            System.out.println();
        }
    }
}
