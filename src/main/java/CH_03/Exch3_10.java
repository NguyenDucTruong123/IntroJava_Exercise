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
public class Exch3_10 {
     public static void main(String[] args) {
        int n1 = (int) (Math.random() * 100); // Generate a random double from 0 to 1 * 100 then cast to integer
        int n2 = (int) (Math.random() * 100);

        System.out.print("What is " + n1 + " + " + n2 + "? ");

         Scanner input = new Scanner(System.in);
        int userAnswer = input.nextInt();

        if (n1 + n2 == userAnswer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(n1 + " + " + n2 + " should be " + (n1 + n2));
            input.close();
        }
    }
}
