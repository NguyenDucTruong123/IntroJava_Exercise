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
public class Exch3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap nhiet do va toc do gio ");
        double temperature = input.nextDouble();
        double speed = input.nextDouble();
        if (-58 <= temperature && temperature <= 41 && speed >= 2)  {
            System.out.println("Nhiet do gio lanh");
        }else{
            System.out.println("Du lieu dau vao khong hop le");
        }  
    }
}
