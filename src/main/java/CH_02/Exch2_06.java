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
public class Exch2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int NumberInput = input.nextInt();
        int count = 0;
        do {    
            count += NumberInput % 10;
            NumberInput/= 10;
        } while (NumberInput != 0);
        System.out.println(count);
    }
}
