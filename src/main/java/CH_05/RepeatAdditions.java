package CH_05;

import java.util.Scanner;

public class RepeatAdditions {
    private static final int NUMBER_OF_QUESTIONS = 2;
    public static void main(String[] args) {

            int correctAnswers = 0;
            int count = 0; // Number of questions asked
            long startTime = System.currentTimeMillis();
            String result = "";

            Scanner in = new Scanner(System.in);

            while (count < NUMBER_OF_QUESTIONS) {

                int n1 = 1 + (int) (Math.random() * 15);
                int n2 = 1 + (int) (Math.random() * 15);

                System.out.println("What is " + n1 + " + " + n2 + "? ");
                int answer = in.nextInt();

                if (n1 + n2 == answer) {
                    System.out.println("Correct answer!\n");
                    correctAnswers++;

                } else {
                    System.out.println("Wrong answer...");
                    System.out.println("(Answer) " + n1 + " + " + n2 + " = " + (n1 + n2));

                }
                count++;
            }

            long endTime = System.currentTimeMillis();
            long totalTimeMillis = endTime - startTime;


            System.out.println("Total correct answers is " + correctAnswers);
            System.out.println("Total runtime was: " + (totalTimeMillis / 1000) + " seconds.");
        }
    }

