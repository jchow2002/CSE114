
// Jacky Chow 113268425 CSE114.L09 HW2
import java.util.Arrays;
import java.util.Scanner;

public class HW2problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String input2 = scanner.nextLine();
        scanner.close();
        checkAnagrams(input1, input2);
    }

    public static void checkAnagrams(String n1, String n2) {
        String formattedn1 = n1.replaceAll(" ", "").toLowerCase();
        String formattedn2 = n2.replaceAll(" ", "").toLowerCase();

        if (formattedn1.length() == formattedn2.length()) {

            char[] charn1 = new char[formattedn1.length()];
            char[] charn2 = new char[formattedn2.length()];

            // charn1 = formattedn1.toCharArray();
            // charn2 = formattedn2.toCharArray();

            for (int i = 0; i < formattedn1.length(); i++) {
                charn1[i] = formattedn1.charAt(i);
            }

            for (int i = 0; i < formattedn2.length(); i++) {
                charn2[i] = formattedn2.charAt(i);
            }
            Arrays.sort(charn1);
            Arrays.sort(charn2);
            // System.out.println(Arrays.toString(charn1));
            // System.out.println(Arrays.toString(charn2));

            if (Arrays.equals(charn1, charn2))
                System.out.println(n1 + " and " + n2 + " are anagrams");
            else
                System.out.println(n1 + " and " + n2 + " are NOT anagrams");
        } else
            System.out.println(n1 + " and " + n2 + " are NOT anagrams");

    }
}