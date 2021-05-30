import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.length() == 11) {
            if (Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(1))
                    && Character.isDigit(input.charAt(2)) && input.substring(3, 4).equals("-")
                    && Character.isDigit(input.charAt(4)) && Character.isDigit(input.charAt(5))
                    && input.substring(6, 7).equals("-") && Character.isDigit(input.charAt(7))
                    && Character.isDigit(input.charAt(8)) && Character.isDigit(input.charAt(9))
                    && Character.isDigit(input.charAt(10)))
                System.out.println(input + " is a valid social security number");
            else
                System.out.println(input + " is an invalid social security number");
        } else
            System.out.println(input + " is an invalid social security number");
    }
}
