// Jacky Chow 113268425 CSE114.L09
import java.util.Scanner;

public class Question2 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distance = Math.pow((Math.pow(x2-x1,2)) + (Math.pow(y2 - y1, 2)), 0.5);
        System.out.println("The distance between the two points is " + distance);
    }
}

