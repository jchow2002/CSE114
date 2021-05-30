import java.util.Scanner;

public class RowSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        scanner.close();
        System.out.print("The row-sorted array is: ");
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix1[i].length; j++)
                System.out.print(sortRows(matrix1)[i][j] + " ");
        }

    }

    public static double[][] sortRows(double[][] m) {
        double temp;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length - 1; j++) {
                if (m[i][j] > m[i][j + 1]) {
                    temp = m[i][j];
                    m[i][j] = m[i][j + 1];
                    m[i][j + 1] = temp;
                }
            }
        }
        return m;

    }
}