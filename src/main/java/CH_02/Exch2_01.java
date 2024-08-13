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
public class Exch2_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number celsius:");
        double celsius = input.nextDouble();
        double fahrenheit = ((9.0 / 5) * celsius + 32);
        System.out.printf("%.1f",fahrenheit);
    }
}
