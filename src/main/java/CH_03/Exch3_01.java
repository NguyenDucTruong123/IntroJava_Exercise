/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_03;

import java.util.Scanner;

/**
 *
 * @author ductr
 */
public class Exch3_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a, b, and c now: ");

        double a, b, c;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            System.out.println("The discriminate is negative, the equation has no real roots.");
        } else if (discriminant > 0) {
            double r1 = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = ((-1 * b) - Math.pow(discriminant, 0.5)) / (2 * a);

            System.out.print("Two real roots: " + r1 + ", " + r2);


        } else {
            double r = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.print("One real root: " + r);
        }
        input.close();
             
    }
}
