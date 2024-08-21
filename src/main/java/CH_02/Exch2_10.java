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
public class Exch2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double M = input.nextDouble();
        double initialTemp = input.nextDouble();
        double finalTemp = input.nextDouble();
        double Q = M * (finalTemp - initialTemp) * 4184;
        System.out.println(Q);
              
    }
}
