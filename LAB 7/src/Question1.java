// Jacky Chow 113268425 CSE114.L09
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int input = scanner.nextInt();
        scanner.close();

        if ((input / 100) % 10 == input % 10)
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");
    }
}
