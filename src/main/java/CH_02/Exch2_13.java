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
public class Exch2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  monthly contribution: ");
        double monthDeposit  = input.nextDouble();
        double interestPerMonth  = 0.05/12;
        double interestFactor = 1 + interestPerMonth;
        int count = 6;
        double total = 0;
            while(count != 0){
            total = (total + monthDeposit) * interestFactor;
            -- count;
        }
        System.out.print("At a 5% interest rate, you will have $");
        System.out.printf("%.2f", total);
        System.out.print(" in your saving account after six months");
    }
}
