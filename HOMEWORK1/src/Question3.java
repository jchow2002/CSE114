// Jacky Chow 113268425 CSE114
import java.util.Scanner;

public class Question3 {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        int distance = scanner.nextInt();
        scanner.close();
       
        int zeroToFifty = distance * 3;
        int fiftyoneToHundred = (distance - 50) * 2 +  50 * 3;
        int hundredAbove = distance - 100 + 50 * 2 + 50 * 3;

        // First 50 miles are 3$ per km
        if (distance < 50)
            System.out.println(zeroToFifty + "$");
        // Distance between 50 and 100 are 2$ per km
        else if (distance > 50 && distance <= 100)
            System.out.println(fiftyoneToHundred + "$" + " (50*3+" + (distance - 50) + "*2)");    
        // Distances above 100 are 1$ per km
        else
            System.out.println(hundredAbove + "$" + " (50*3+50*2+"+ (distance - 100) + "*1)");
    }
}