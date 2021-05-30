import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the side: ");
        double n = scanner.nextDouble();
        System.out.println("The area of the pentagon is " + area(n));
        scanner.close();
    }

    public static double area(double side) {
        double area = ((5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5)));
        return area;
    }
}
