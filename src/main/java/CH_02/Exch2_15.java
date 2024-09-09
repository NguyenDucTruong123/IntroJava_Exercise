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
public class Exch2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y1: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double totalTwoPoints = convertTotalTwoPoints(x1, y1, x2, y2);
        double result = Math.pow(totalTwoPoints,0.5);
        System.out.println("The distance between the two points is " + result);
    }
    
    public static double convertTotalTwoPoints (double x1, double y1 , double x2 , double y2 ){
        double resultTotal1 = Math.pow((x2 - x1),2);
        double resultTotal2 = Math.pow((y2 - y1),2);
        double total = resultTotal1 + resultTotal2;
        return total;
    };
}
