// Jacky Chow 113268425 CSE114.L09
import java.util.Scanner;
import java.text.DecimalFormat;

public class Question1 {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = scanner.nextDouble();

        double weightInKilo = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double BMI = weightInKilo / (Math.pow(heightInMeters, 2));

        DecimalFormat round = new DecimalFormat("###.####");
        System.out.println("BMI is " + round.format(BMI));
    }
}
