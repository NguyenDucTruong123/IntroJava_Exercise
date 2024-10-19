/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_02;

import java.util.Scanner;

/**
 *
 * @author ductr
 */
public class Exch2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate: (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double rate = input.nextDouble();
        double interest = balance * (rate / 1200);
        double roundedInterest = Math.round(interest * 100000) / 100000.0;
        System.out.println("The interest rate is: " + roundedInterest);
//        input.close();
    }
}
