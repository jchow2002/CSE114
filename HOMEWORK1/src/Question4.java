// Jacky Chow 113268425 CSE114
import java.util.Scanner;

public class Question4 {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 digits: ");
        int input = scanner.nextInt();
        scanner.close();
        
        // This if statement detects any numbers that are more or less than 5 digits, and prints out invalid length.
        if (input >= 100000 || input < 10000)
            System.out.println("Invalid Length!");
        
        // Divide each number for desired digit, and mod by 10 to get the exact number.
        else
            System.out.println(input / 10000 + "   " + (input / 1000) % 10 + "   " + (input / 100) % 10 +
            "   " + (input / 10) % 10 + "   " + input % 10);

        /* If the user enters numbers with more or less than 5 digits, then the program will not
        produce the desired spacing intended for 5 digit numbers. For example, numbers with 6 digits (123456) 
        will produce the result of 12   3   4   5   6. While numbers with 2 digits (14) will produce 
        the result of 0   0   0   1   4. In order to prevent this from happening, use an if statment to determine
        the length of number that the user enter, if it is not equal to 5, then it will be an invalid input. */
    }
}