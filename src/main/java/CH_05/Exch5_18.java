package CH_05;

import java.util.Scanner;

public class Exch5_18 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int PA = 1; PA <= 6; PA++) {
            int numOffSet = 6 - PA ;
           for (int j = 1; j <= 6 - numOffSet; j++) {
               System.out.printf("%2d", j);
           }
            System.out.println();
        }
        System.out.println("Pattern B");
        for (int PatternB = 1; PatternB <= 6; PatternB++) {
            int numOffSet = 6 - PatternB + 1 ;
            for (int j = 1; j <= numOffSet; j++) {
                System.out.printf("%2d", j);
            }
            System.out.println();
        }
        System.out.println("Pattern C");
        for (int PatternC = 1; PatternC <= 6; PatternC++) {
            for (int i = 6 - PatternC ; i >= 1 ; i--) {
                System.out.print("  ");
            }
            for (int j = PatternC; j >= 1; j--) {
                System.out.printf("%2d", j);
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for (int PatternD = 0; PatternD < 6; PatternD++) {
            for (int i = PatternD ; i >= 1 ; i--) {
                System.out.print("  ");
            }
            for (int j = 1 ; j <= 6 - PatternD; j++) {
                System.out.printf("%2d", j);
            }

            System.out.println();
        }
    }
}
