package CH_05;

import java.util.Scanner;

public class Exch5_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int numberLines = sc.nextInt(); // 5
        for (int i = 1; i <= numberLines; i++) {
            int offSetNum = numberLines - i; // 4 3 2
            for (int j = 0; j <= offSetNum; j++) {
                System.out.print("    ");
            }
            for (int leftSideNum = numberLines - offSetNum; leftSideNum >= 2 ; leftSideNum--) {
                System.out.printf("%4d", (leftSideNum));
            }
            for (int rightSideNum = 1 ; rightSideNum <= numberLines - offSetNum ; rightSideNum++) {
                System.out.printf("%4d", (rightSideNum));
            }
            System.out.println();
        }
    }
}
