import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] list = new double[3][3];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        if (isMarkovMatrix(list) == true)
            System.out.println("It is a Markov matrix");
        else
            System.out.println("It is not a Markov matrix");

    }

    public static boolean isMarkovMatrix(double[][] m) {
        boolean positive = false;
        boolean columnSumIs1 = false;
        boolean isMarkovMatrix = false;

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                if (m[row][column] > 0)
                    positive = true;
                else
                    positive = false;
            }
        }

        for (int column = 0; column < m[0].length; column++) {
            double sum = 0;
            for (int row = 0; row < m[column].length; row++) {
                sum = sum + m[row][column];
            }
            if (sum == 1)
                columnSumIs1 = true;
            else
                columnSumIs1 = false;

        }
        if (positive == true && columnSumIs1 == true)
            isMarkovMatrix = true;
        else
            isMarkovMatrix = false;
        return isMarkovMatrix;
    }
}
