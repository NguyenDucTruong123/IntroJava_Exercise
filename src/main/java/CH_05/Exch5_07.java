package CH_05;

public class Exch5_07 {
    public static void main(String[] args) {
        // Initial tuition fee
        double tuition = 10000;

        // Annual increase rate
        double rate = 0.05;

        // Calculate tuition in 10 years
        for (int year = 0; year < 10; year++) {
            tuition += tuition * rate;
        }

        double tuitionIn10Years = tuition;

        // Calculate the total cost of four years' worth of tuition starting after the tenth year
        double totalCost = 0;
        for (int year = 0; year < 4; year++) {
            totalCost += tuition;
            tuition += tuition * rate;
        }

        // Display the results
        System.out.printf("Tuition in 10 years: $%.2f\n", tuitionIn10Years);
        System.out.printf("Total cost of four years starting after the tenth year: $%.2f\n", totalCost);
    }
}
