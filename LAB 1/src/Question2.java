import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter v0: ");
        double v0 = scanner.nextDouble();
        System.out.print("Enter v1: ");
        double v1 = scanner.nextDouble();
        System.out.print("Enter t: ");
        double t = scanner.nextDouble();

        double a = (v1 - v0) / t;
        System.out.println("The average acceleration is " + a);

    }
}
