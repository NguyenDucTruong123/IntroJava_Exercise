/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_02;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;

/**
 *
 * @author ductr
 */
public class Exch2_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds:");
        double pounds = input.nextDouble();
        double result = pounds * 0.454;
        System.out.println(pounds + "pounds id " + result + " kilograms");
    }
}
