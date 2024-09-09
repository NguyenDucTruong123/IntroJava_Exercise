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
public class Exch2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();
        System.out.println("Enter the wind speed ( 7 = 2) in miles per hour: ");
        double windSpeed = input.nextDouble();
        double chillIndex = Calculations(temperature, windSpeed);
        System.out.printf("The wind chill index is %f",chillIndex);
        
        
    }
    
    public static double Calculations(double temperature , double windSpeed){
        double result = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        return result;
    }
}
