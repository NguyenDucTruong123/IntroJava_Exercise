/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_03;

import java.util.Scanner;

/**
 *
 * @author ductr
 */
public class Exch3_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Please enter a three integers:");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x > y) {
            int temp1 = x;
            x = y;
            y = temp1;

        }

        if (y > z) {
            int temp2 = y;
            y = z;
            z = temp2;
        }

        if (x > y) {
            int temp3 = x;
            x = y;
            y = temp3;
        }
        System.out.println(x + "" + y + "" + z);
        
    }
}
