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
public class Exch2_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble();
        double gratuity = subtotal * (gratuity_rate /100) ;
        double total = gratuity + subtotal;
        System.out.printf("The gratuity is " + "$"+gratuity + " and total is" + "$"+total);
    }
}
