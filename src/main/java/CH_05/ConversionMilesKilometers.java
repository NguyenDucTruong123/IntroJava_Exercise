package CH_05;

import java.util.Scanner;

public class ConversionMilesKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double Miles_per_Kilometers = 1.609;
        System.out.println("Milmes      Kilometers");
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf(
                    "%-15d%6.1f\n", i, (i * Miles_per_Kilometers));
        }
    }
}
