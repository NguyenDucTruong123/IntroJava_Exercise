package CH_04;

import java.util.Scanner;

public class Exch4_01 {
    public static double LengthSide(double vertex) {
        return (double) 2 * vertex * Math.sin(Math.PI / 5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        double vertex = sc.nextDouble();
        double result = LengthSide(vertex);
        double area = (5 * Math.pow(result, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is: %2.2f ", area);
    }

}
