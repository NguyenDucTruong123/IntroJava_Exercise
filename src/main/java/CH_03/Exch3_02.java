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
public class Exch3_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a value for a ,b ,c ,d ,e , and f (Make sure to leave a space between each number): ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double y = 0;
        double x = 0;

        if (a * d - b * c < 0.000000001) {
            System.out.println("The equation has no solution :(");
            System.out.println(a + " * " + c + " - " + b + " * " + c + " = " + " 0 ");

        } else {

            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e * c) / (a * d - b * c);

            System.out.print("(" + e + " * " + d + " - " + b + " * " + f + ""
                    + ") / (" + a + " * " + d + " - " + b + " * " + c + ")");

            System.out.print(" = x = " + x);

            System.out.print("\nand");

            System.out.print("\n(" + a + " * " + f + " - " + e + " * " + c + ""
                    + ") / (" + a + " * " + d + " - " + b + " * " + c + ")");

            System.out.print(" = y = " + y);

        }
    }
   }

