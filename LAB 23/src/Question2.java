import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = scanner.nextInt();
        scanner.close();
        System.out.println("Decimal number: " + bin2Dec(binary));
    }

    public static int bin2Dec(int value) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (value != 0) {
            result.add(value % 10);
            value = value / 10;
        }

        int decimal = 0;
        for (int i = 0; i < result.size(); i++) {
            decimal = decimal + result.get(i) * (int) Math.pow(2, i);
        }
        return decimal;
    }
}