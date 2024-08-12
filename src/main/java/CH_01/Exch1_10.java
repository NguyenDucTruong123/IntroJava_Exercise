/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_01;

/**
 *
 * @author ductr
 */
public class Exch1_10 {
    public static void main(String[] args) {
        double numMiles = 14 / 1.6;            //Convert kilometers into MPH
        double speed = numMiles / (45.5 / 60);            //Average speed in miles per hour

        System.out.printf("%.3f", speed);
    }
}
