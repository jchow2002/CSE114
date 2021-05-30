// Jacky Chow 113268425 CSE114.L09
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3 %): ");
        double balance = scanner.nextDouble();
        double annualInterest = scanner.nextDouble();
        double interestRate = (balance * (annualInterest / 12)) / 100;
        System.out.println("The interest is " + interestRate);
    }
}
