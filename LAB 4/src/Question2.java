// Jacky Chow 113268425 CSE114.L09
import java.util.Scanner;
import java.text.DecimalFormat;

public class Question2 {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter Miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
        DecimalFormat round = new DecimalFormat("###.##");
        System.out.println("The cost of driving is: $" + round.format(costOfDriving));
    }
}
