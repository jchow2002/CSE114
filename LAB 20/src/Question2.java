import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        double discriminant = quadratic.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("The equation has two roots: " + quadratic.getRoot1() + " and " + quadratic.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root: " + quadratic.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");

        }

    }

}