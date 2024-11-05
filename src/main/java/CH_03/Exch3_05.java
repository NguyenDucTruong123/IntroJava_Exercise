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
public class Exch3_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day:");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int dayGap = input.nextInt();
        if (today > 6 || today < 0) {
            System.out.println("Incorrect value....Please try again and enter an integer 0 through 6: ");
            input.close();
        } else {
             int futureWeekDay = (today + dayGap) % 7;

            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            System.out.println(daysOfWeek[futureWeekDay]);
            input.close();
        }
                
    }
}
