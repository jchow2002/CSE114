
// Jacky Chow 113268425 CSE114.L09 HW2
import java.util.Scanner;

public class HW2problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();
        scanner.close();
        if (palindrome(input) == true)
            System.out.println("Input string " + input + " is a palindrome");
        else
            System.out.println("Input string " + input + " is NOT a palindrome");

    }

    public static boolean palindrome(String n) {
        String newinput = n.replaceAll(" ", "").toLowerCase();
        String empty1 = "";
        String empty2 = "";

        // revserse
        for (int i = newinput.length() - 1; i >= 0; i--) {
            empty1 = empty1 + newinput.charAt(i);
        }
        // forward
        for (int i = 0; i < newinput.length(); i++) {
            empty2 = empty2 + newinput.charAt(i);
        }
        boolean yesOrNo;
        if (empty1.equals(empty2))
            yesOrNo = true;
        else
            yesOrNo = false;
        return yesOrNo;
    }

}