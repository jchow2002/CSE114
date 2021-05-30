import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n) {

        int numOfSpaces = n - 1;

        for (int i = 1; i <= n; i++) {
            // int number = 1;
            for (int j = 0; j < numOfSpaces; j++) {
                System.out.print("  ");
            }
            numOfSpaces--;

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}
