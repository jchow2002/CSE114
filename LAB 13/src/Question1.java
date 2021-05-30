import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character: ");
        char a = scanner.nextLine().charAt(0);
        scanner.close();
        System.out.println("The count of " + a + " is " + count(str, a));

    }

    public static int count(String str, char a) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                counter++;
        }
        return counter;
    }
}
