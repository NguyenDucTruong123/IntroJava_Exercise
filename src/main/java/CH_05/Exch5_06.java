package CH_05;

import java.util.Scanner;

public class Exch5_06 {
    public static void main(String[] args) {
        final double Kilo_Per_Mile = 1.609;
        System.out.println("Miles       Kilometers  |  Kilometers     Miles");
        for (int i = 0, j = 20 ; i < 10 ; i++ , j+=5 ) {
            System.out.printf("%-11d%10.3f", i, (i * Kilo_Per_Mile));
            System.out.print("   |   ");
            System.out.printf("%-15d%-6.3f\n", j, (j / Kilo_Per_Mile));
        }
    }
}
