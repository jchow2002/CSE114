
// Jacky Chow CSE114 HW5 Problem3
import java.util.Scanner;
import java.util.ArrayList;

public class HW5Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.print("Elements of the Character array list: ");

        for (int i = 0; i < toCharacterArray(input).size(); i++) {
            System.out.print(toCharacterArray(input).get(i) + " ");
        }

    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> newString = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            newString.add(s.charAt(i));
        }
        return newString;
    }
}