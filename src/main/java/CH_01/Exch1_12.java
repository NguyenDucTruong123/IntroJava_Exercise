/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_01;

/**
 *
 * @author ductr
 */
public class Exch1_12 {
    public static void main(String[] args) {
          double hrs = 1;
        double mins = 40;
        double secs = 35;
        double totaldist = 24;
        double kilodist = totaldist * 1.6;
        double converttomin = hrs * 60 + mins + secs / 60;
        double KPH = 60 * kilodist / converttomin;

        System.out.println(KPH);
    }
}
