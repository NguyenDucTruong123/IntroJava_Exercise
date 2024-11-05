/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH_03;

import java.util.Random;

/**
 *
 * @author ductr
 */
public class Exch3_16 {
    public static void main(String[] args) {
        Random random = new Random();

        //Random boolean value indicates making the number negative.
        boolean negOrPosX = random.nextBoolean();
        boolean negOrPosY = random.nextBoolean();

        int x = (int) ((Math.random() * 100));
        int y = (int) ((Math.random() * 200));


        if (negOrPosX) {
            x = x * -1;
        }

        if (negOrPosY) {
            y = y * -1;
        }

        System.out.println("(" + x + "," + y + ")");
    } 
}
