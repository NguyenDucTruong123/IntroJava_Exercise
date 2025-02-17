package CH_05;

public class Exch5_05 {
    public static void main(String[] args) {
        System.out.println("Kilograms Pounds | Pounds Kilograms");
        for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
            double calcPound = i * 1.609;
            if (i < 10) {
                System.out.print(i + "  ");
            } else if (i < 100) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + "");
            }


            System.out.printf("%12.1f |", calcPound);
            System.out.printf("%4d    ", j);

            double calcKilo = j / 1.609;
            System.out.printf("%8.2f\n", calcKilo);
        }

    }
}
