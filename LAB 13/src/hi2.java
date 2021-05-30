import java.util.Scanner;

public class hi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of string: ");
        int first = scanner.nextInt();
        System.out.println("Enter the case input: ");
        char cases = scanner.next().charAt(0);
        System.out.println("Random String: " + randomString(first, cases));

    }

    public static String randomString(int first, char cases) {
        String result = "";
        if (cases == 'l' || cases == 'L') {
            for (int i = 0; i < first; i++) {
                char randomletters = (char) ('a' + Math.random() * ('z' - 'a' + 1));
                String randomString = Character.toString(randomletters);
                result = result + randomString;
            }
        }

        else if (cases == 'U' || cases == 'u') {
            for (int i = 0; i < first; i++) {
                char randomletters = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
                String randomString = Character.toString(randomletters);
                result = result + randomString;
            }
        }
        return result;
    }
}
