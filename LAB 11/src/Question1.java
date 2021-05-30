import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the phone number : ");
        String input = scanner.nextLine();
        scanner.close();
        if (input.length() == 10)
            System.out.println("Formatted phone number : " + input.substring(0, 0) + "(" + input.substring(0, 3) + ")"
                    + input.substring(3, 6) + "-" + input.substring(6, 10));
        else
            System.out.println("Invalid Input.");
    }
}
