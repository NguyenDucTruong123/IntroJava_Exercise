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
public class Exch3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three-digits integer: ");
        int startNum = input.nextInt();
        int numLast = startNum % 10;
        int numFirst = startNum / 100;
        input.close();

        if (numLast == numFirst) {
            System.out.println("This number is a Palindrome!");
        } else
            System.out.println("This number is not a Palindrome :(");
        
    }
}
