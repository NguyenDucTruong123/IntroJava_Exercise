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
public class Exch2_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input radius: ");
        double radius = input.nextDouble();
        System.out.println("Input Length");
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = length * area;
        System.out.printf("%.5f",area);
        System.out.println("");
        System.out.printf("%.1f",volume);
        
        input.close();
    }
}
