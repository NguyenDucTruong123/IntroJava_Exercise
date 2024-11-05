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
public class Exch3_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int CISSOR = 0;
        final int ROCK = 1;
        final int PAPER = 2;

        System.out.println("scissor (0) , rock(1) , paper(2): ");
        int userPlay = input.nextInt();
        if (userPlay == 0 || userPlay == 1 || userPlay == 2) {
            int npc = (int) (Math.random() * 3);
            switch (userPlay) {
                case 0 -> {
                    switch (npc) {
                        case CISSOR ->
                            System.out.println("It is a draw");
                        case ROCK ->
                            System.out.println("You lose");
                        case PAPER ->
                            System.out.println("You won");
                    }
                }
                case 1 -> {
                    switch (npc) {
                        case CISSOR ->
                            System.out.println("You won");
                        case ROCK ->
                            System.out.println("It is a draw");
                        case PAPER ->
                            System.out.println("You lose");
                    }
                }
                case 2 -> {
                    switch (npc) {
                        case CISSOR ->
                            System.out.println("You lose");
                        case ROCK ->
                            System.out.println("You won");
                        case PAPER ->
                            System.out.println("It is a draw");
                    }
                }
                default ->
                    throw new AssertionError();
            }
            System.out.println("The npc is " + npc);
        } else {
            System.out.println("Computer wins, you input an invalid value so you forfiet this round!");
        }
    }

}
