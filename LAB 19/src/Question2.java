import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextDouble();
            }
        }
        scanner.close();
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {

            sum = sum + m[row][row];
            // row same as column num
        }
        return sum;
    }
}
