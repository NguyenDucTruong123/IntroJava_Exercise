package CH_05;

import java.util.Scanner;

public class Exch5_09 {
    public static void main(String[] args) {
        double highScore = 0, secondHigh = 0 , thirdHigh = 0 ;

        String highName = "";
        String thirdName = "";
        String secondName = "";
        String tempName = "";
        double tempScore = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        int numStudents = input.nextInt();

        System.out.print("Enter a students name: ");
        highName = input.next();

        System.out.print("Enter the students score: ");
        highScore = input.nextDouble();

        while (numStudents > 1) {
            System.out.print("Enter a students name: ");
            tempName = input.next();

            System.out.print("Enter the students score: ");
            tempScore = input.nextDouble();

            if (tempScore > highScore) {
                secondHigh = highScore;
                secondName = highName;
                highScore = tempScore;
                highName = tempName;
                numStudents--;
                continue;
            }

            if (tempScore < highScore && tempScore > secondHigh && tempScore > thirdHigh) {
                secondHigh = tempScore;
                secondName = tempName;
                thirdHigh = tempScore;
                thirdName = tempName;
            }
            if (secondHigh == thirdHigh){
                numStudents--;
                continue;
            }
            numStudents--;

        }
        System.out.println("The top three students are: ");
        System.out.print(highName + "'s score of " + highScore);
        System.out.print(" and " + secondName + "'s score of " + secondHigh);
        System.out.print(" and " + thirdName + "'s score of " + secondHigh);
    }

    }

