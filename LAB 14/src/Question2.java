import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        reverse(number);

    }

    public static void reverse(int number) {
        while (number > 0) {
            System.out.print((number % 10));
            number = number / 10;
        }
    }

}
