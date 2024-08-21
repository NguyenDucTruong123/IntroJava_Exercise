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
public class Exch2_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input minutes: ");
        int minutes = input.nextInt();
        int years = yearsConversion(minutes);
        int days = daysConversion(minutes);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        
    }
    public static int yearsConversion(int minutes){
            int years =  minutes / (60 * 24 * 365);
            return years;
       }
    
    public static int daysConversion(int minutes){
        int years = minutes % (60 * 24 * 365);
        int days = years / (60 * 24);
        return days;
    }

}
