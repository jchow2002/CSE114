import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 10 numbers: ");
        double x[] = new double[10];
        for (int i = 0; i < x.length; ++i) {
            x[i] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println(Arrays.toString(reverse(x)));
    }

    public static double[] reverse(double[] x) {
        double holder;
        for (int i = 0, j = x.length - 1; i < x.length / 2; i++, j--) {
            holder = x[i];
            x[i] = x[j];
            x[j] = holder;

        }
        return x;
    }
}