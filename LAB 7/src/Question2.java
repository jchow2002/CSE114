// Jacky Chow 113268425 CSE114.L09
import java.util.Scanner;

public class Question2 {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        double formula = Math.pow(Math.pow(x - 0, 2) + Math.pow(y - 0, 2), 0.5);
        
        if (formula <= 10)
            System.out.println("Point (" + x + "," + y + ") is in the circle");
        else 
            System.out.println("Point (" + x + "," + y + ") is not in the circle");
    }
}
