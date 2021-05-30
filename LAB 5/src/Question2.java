import java.util.Scanner;
import java.text.DecimalFormat;

public class Question2 {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        Double length = scanner.nextDouble();
        Double result = (3 * Math.pow(3, 0.5) * (Math.pow(length, 2))) / 2;
        DecimalFormat round = new DecimalFormat("###.####");
        System.out.println("The area of the hexagon is " + round.format(result));
        scanner.close();
    }
}
