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
public class Exch2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        
        double kilograms = convertKilo(weight);
        double meters = convertHeight(height);
        
        double result = kilograms / Math.pow(meters , 2);
        System.out.printf("BMI is: %.4f ",result);
    }
    
    public static double convertKilo ( double pounds){
        double convertKilo = pounds * 0.45359237;
        return convertKilo;
    };
    
    public static double convertHeight( double inches){
        double convertHeight = inches * 0.0254;
        return convertHeight;
    };
}
