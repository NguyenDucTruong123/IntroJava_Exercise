package CH_04;

import java.util.Scanner;

public class Exch4_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        Long startTime = System.currentTimeMillis();
        String output = "";
        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.println(number1 + " - " + number2 + " ? ");
            int answer = sc.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("Correct");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + number1 + " – " + number2 + " should be " + (number1 - number2));
            }
            count++;
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
