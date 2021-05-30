import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();
        
        double r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
        double r2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        
        if (discriminant > 0) 
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        if (discriminant == 0)
            System.out.println("The equation has one root " + r1);
        if (discriminant < 0)
            System.out.println("The equation has no real roots.");
    }
}
