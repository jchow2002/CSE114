import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main (String []args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        while (principal > 1_000_000 || principal < 1_000) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (!(principal > 1_000_000 || principal < 1_000))
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        float interest = 0;
        while (interest > 30 || interest <= 0) {
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();
            if (!(interest > 30 || interest <= 0))
                break;
            System.out.println("Enter a number that is greater than 0 and less than or equal to 30");
        }
        float monthly_interest = interest / PERCENT / MONTHS_IN_YEAR;

        int period = 0;
        while (period < 1 || period >30) {
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if (!(period < 1 || period >30))
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        int numberOfPayments = period * MONTHS_IN_YEAR;

        double mortgage = principal
                * (((monthly_interest * Math.pow(1 + monthly_interest, numberOfPayments)))
                / ((Math.pow(1 + monthly_interest, numberOfPayments) - 1)));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);

        System.out.println("Mortgage: " + result);
    }
}

