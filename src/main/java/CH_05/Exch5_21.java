package CH_05;

import java.util.Scanner;

public class Exch5_21 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Loan amount: ");
        double loanAmount = in.nextDouble();

        System.out.println("Number of years: ");
        int numYears = in.nextInt();
        System.out.println("\nInterest rate - Monthly Payment - Total Payment");
        for (double i = 5.0; i <= 8.0; i += 0.125) {

            // Obtain monthly interest rate
            double monthlyInterestRate = i / 1200; //As decimal number
            // Calculate payment
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, numYears * 12));
            double totalPayment = monthlyPayment * numYears * 12;

            System.out.printf("\t%.3f", i);
            System.out.print("%");
            System.out.printf("\t\t\t%.2f", monthlyPayment);
            System.out.printf("\t\t\t%.2f", totalPayment);
            System.out.println();

        }


        in.close();
    }
}
