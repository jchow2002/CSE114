// Jacky Chow 113268425 CSE114 L.09
import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double mass = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initial_temp = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double final_temp = scanner.nextDouble();

        double energy = mass * (final_temp - initial_temp) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}
