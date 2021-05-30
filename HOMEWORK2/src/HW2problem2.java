
// Jacky Chow 113268425 CSE114.L09 HW2
import java.util.Scanner;

public class HW2problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String input = scanner.nextLine();
        scanner.close();
        boolean valid = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0' && input.charAt(i) != '1') {
                valid = false;
            }
        }
        if (valid == false)
            System.out.println("The input word is not a valid binary number");
        else {
            boolean accepted = false;
            for (int i = 0; i < input.length() - 2; i++) {
                if (input.charAt(i) == '1' && input.charAt(i + 1) == '1' && input.charAt(i + 2) == '1')
                    accepted = true;
            }
            if (accepted == true)
                System.out.println("The binary word is accepted");
            else
                System.out.println("The binary word is rejected");
        }
    }
}