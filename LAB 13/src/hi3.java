import java.util.Scanner;

public class hi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first int: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second int: ");
        int second = scanner.nextInt();

        int length = Math.max(first, second);
        int div = 0;
        for (int i = 1; i < length; i++) {
            if (first % i == 0 && second % i == 0)
                div = i;
        }
        System.out.println(div);
    }
}
