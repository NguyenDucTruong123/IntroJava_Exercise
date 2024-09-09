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
public class Exch2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal for the length of the side of a hexagon: ");
        double side = input.nextDouble();
        double operand = (3 * Math.pow(3, 0.5)) / 2;
        double res = operand * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + res);

    }
    
}