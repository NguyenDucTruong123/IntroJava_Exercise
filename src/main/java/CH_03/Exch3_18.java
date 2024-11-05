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
public class Exch3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your packages weight: ");
        String shipping = "";

        double weight = input.nextDouble();

        if (weight > 50) {
            System.out.println("The package cannot be shipped.");
            input.close();
            return;
        } else if (weight > 0 && weight <= 1) {
            shipping += 3.5;

        } else if (weight > 1 && weight <= 3) {
            shipping += 5.5;

        } else if (weight > 3 && weight <= 10) {
            shipping += 8.5;

        } else if (weight > 10 && weight <= 20) {
            shipping += 10.5;

        }
        System.out.println("With a package weight of " + weight + " your cost of shipping will be " + shipping);
        input.close();
    } 
}
