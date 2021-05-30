import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 10 numbers: ");
        double x[] = new double[10];
        for (int i = 0; i < x.length; ++i) {
            x[i] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println(Arrays.toString(x));
        System.out.println("The mean is " + mean(x));
        System.out.println("The standard deviation is " + standardDeviation(x));
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        double mean = sum / x.length;
        return mean;
    }

    public static double standardDeviation(double[] x) {
        double mean = mean(x);
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow((x[i] - mean), 2);
        }
        double standardDeviation = Math.sqrt(sum / (x.length - 1));
        return standardDeviation;
    }
}
