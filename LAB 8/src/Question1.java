import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();
        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();
        scanner.close();

        double formula = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area of the polygon is " + formula);
    }
}
