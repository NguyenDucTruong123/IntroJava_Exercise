package CH_03;

import java.util.Scanner;

public class Exch3_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a point (x ; y)");
        Double x2 = sc.nextDouble();
        Double y2 = sc.nextDouble();
        Double x1 = 0.0;
        Double y1 = 0.0;
        double distanceToZero = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        String res = "";
        if (distanceToZero <= 10) {
            res += "is in the circle";
        } else {
            res += "is not in the circle";
        }

        System.out.println("Point (" + x2 + ", " + y2 + ") " + res);
    }
}
