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
public class Exch2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration:");
        double speed = input.nextDouble();
        double accel = input.nextDouble();
        double length = Math.pow(speed, 2)/(2 * accel);
        System.out.printf("The minimum runway length for this airplane is: %.3f ",length);
    }
}
