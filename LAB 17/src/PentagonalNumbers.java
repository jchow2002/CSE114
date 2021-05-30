import java.util.Scanner;

public class PentagonalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer for the n pentagonal numbers you want displayed:");
        int count = scanner.nextInt();

        for (int i = 1; i < count + 1; i++) {
            System.out.print(getPentagonalNumber(i) + " ");
            if (i % 10 == 0)
                System.out.println();
            if (i == count)
                System.out.println();
        }
    }

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }
}