import java.util.Scanner;
import java.text.DecimalFormat;

public class Question1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double outSideTemp = 100;
    while (outSideTemp < -58 || outSideTemp > 41) {
        System.out.print("Enter the temperature in Fahrenheit between -58 Fahrenheit and 41 Fahrenheit: ");
        outSideTemp = scanner.nextDouble();
        if (!(outSideTemp < -58 || outSideTemp> 41))
            break;
        System.out.println("Retry!");
    }
    
    System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
    double windSpeed = scanner.nextDouble();
    
    double windChillTemp = 35.74 + (0.6215 * outSideTemp) - (35.75 * Math.pow(windSpeed, 0.16)) + 
                                    (0.4275 * outSideTemp * Math.pow(windSpeed, 0.16));                         
    DecimalFormat round = new DecimalFormat("##.#####");
    System.out.println("The wind chill index is " + round.format(windChillTemp));
    scanner.close();
    }
}
