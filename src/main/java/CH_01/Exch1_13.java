/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_01;

/**
 *
 * @author ductr
 */
public class Exch1_13 {
    public static void main(String[] args) {
           double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);


        System.out.printf("The value for x is: %.2f", x);
        System.out.println();
        System.out.printf("The value of y is: %.2f", y);

    }
}
