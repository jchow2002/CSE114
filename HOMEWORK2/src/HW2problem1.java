
// Jacky Chow 113268425 CSE114.L09 HW2
import java.util.Scanner;

public class HW2problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the user ID: ");
        String input = scanner.nextLine();
        scanner.close();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)))
                ++count;
        }
        // System.out.println(count);
        if (count == 2)
            System.out.println("The input user ID is valid");
        else
            System.out.println("The input user ID is invalid");
    }
}
