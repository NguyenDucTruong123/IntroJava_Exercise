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
public class Exch3_09 {
    public static void main(String[] args) {
        System.out.print("Enter the first 9 digits of an ISBN-10 number: ");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        line = line.trim();

        if (line.length() != 9) {
            System.out.println("Too many numbers entered. Try again, please enter exactly the first NINE digits of " +
                    "the isbn number: ");
            line = input.nextLine();
            line = line.trim();

            if (line.length() != 9) {
                System.out.println("Seriously?...");
            }
        }
        StringBuilder sb = new StringBuilder(line);
        line = sb.reverse().toString(); //Use StringBuilder to reverse the input nums to make operating on them easier
        int isbn = Integer.parseInt(line); //Convert the nums to an integer
        int temp = isbn;
        int t = 0;
        int sum = 0;
        int d10 = 0;
        for (int i = 1; i <= 9; i++) {
            int x = temp % 10; //Remove the last int

            System.out.print("d" + i + " = " + x + " ->: ");
            t = x * i;

            System.out.println("d" + i + " * " + i + " -> " + x + " * " + i + " = " + t);

            System.out.println("sum = " + sum + " + " + t);
            sum += t;
            System.out.println("sum = " + sum);

            temp /= 10; //Remove integer from the string
        }
        d10 = sum % 11;
        System.out.println("d10 = sum % 11 -> " + d10 + " = " + sum + " % 11");

        if (d10 == 10) {
            line = line + "X";
        } else {
            line = line + d10;
        }
        System.out.println("The ISBN-10 number is: " + line);
        input.close();
    }
}
