import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] list = new double[rows][columns];
        System.out.println("Enter the array: ");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        System.out.print("The location of the largest element is at (");
        for (int i = 0; i < locateLargest(list).length; i++) {
            if (i < 1)
                System.out.print(locateLargest(list)[i] + ", ");
            if (i == 1)
                System.out.print(locateLargest(list)[i] + ")");
        }

    }

    public static int[] locateLargest(double[][] a) {
        int[] largestcord = new int[2];
        double temp = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (temp < a[i][j]) {
                    temp = a[i][j];
                    largestcord[0] = i;
                    largestcord[1] = j;

                }

            }

        }
        return largestcord;
    }

}
