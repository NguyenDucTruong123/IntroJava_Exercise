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
public class Exch2_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input V0 V1 t: ");
        float V0 = input.nextFloat();
        float V1 = input.nextFloat();
        float t = input.nextFloat();
        float a = (V1 - V0) / t;
        System.out.println(a);
    }
}
