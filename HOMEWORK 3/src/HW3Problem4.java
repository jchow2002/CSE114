// Jacky Chow 113268425 CSE114 HW3

import java.util.Scanner;
import java.text.DecimalFormat;

public class HW3Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = new double[3][3];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                matrix1[row][column] = scanner.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = new double[3][3];
        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                matrix2[row][column] = scanner.nextDouble();
            }
        }
        scanner.close();

        DecimalFormat round = new DecimalFormat("#.#");

        System.out.println("Multiplication of the matrices is: ");
        for (int row = 0; row < multiplyMatrix(matrix1, matrix2).length; row++) {
            for (int column = 0; column < multiplyMatrix(matrix1, matrix2).length; column++) {
                System.out.print(round.format(multiplyMatrix(matrix1, matrix2)[row][column]) + " ");
            }
            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double a[][], double b[][]) {
        double[][] matrixnewb = new double[3][3];

        for (int i = 0; i < b[0].length; i++) {

            for (int j = 0; j < b.length; j++) {

                matrixnewb[i][j] = b[j][i];
            }
        }

        double[][] matrix3 = new double[3][3];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                for (int k = 0; k < a[i].length; k++)

                    matrix3[i][j] = matrix3[i][j] + a[i][k] * matrixnewb[j][k];
            }
        }
        return matrix3;
    }
}
