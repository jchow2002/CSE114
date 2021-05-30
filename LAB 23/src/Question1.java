import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();
        System.out.println("Binary number: " + dec2Bin(decimal));
    }

    public static String dec2Bin(int value) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (value != 0) {
            result.add(value % 2);
            value = value / 2;
        }
        String binary = "";
        for (int i = result.size() - 1; i >= 0; i--) {
            binary = binary + result.get(i);
        }
        return binary;
    }
}