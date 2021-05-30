// Jacky Chow 113268425 CSE114
import java.util.Scanner;

public class Question2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String input = scanner.next();
        scanner.close();
        
        // Turn the input into uppercase, so it will turn all the lowercases into uppercase.
        // Then convert it into char so that it can detect the range of the alphabet characters.
        String turntoupper = input.toUpperCase();
        char turntocharacter = turntoupper.charAt(0);

        // If the input is within the alphabet range, then it will start to detect whether it is a vowel or a consonant.
        if (turntocharacter >= 'A' && turntocharacter <= 'Z')
            if (turntocharacter == 'A' || turntocharacter == 'E' || turntocharacter == 'I' || turntocharacter == 'O' || turntocharacter == 'U')
                System.out.println(input + " is a vowel");
            else
                System.out.println(input + " is a consonant");
        
        // Otherwise it will considered as an invalid input becasue it is not an alphabet.        
        else
            System.out.println("Invalid Input");
    }
}