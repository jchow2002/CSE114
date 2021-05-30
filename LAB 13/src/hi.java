import java.util.Scanner;

public class hi {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();

        int index = 0;
        String prefix = "";

        while (string1.charAt(index) == string2.charAt(index)) {
            prefix = prefix + string1.charAt(index);
            index++;
        }
        System.out.println(index);
        if (prefix != "")
            System.out.println("The commmon prefix is " + prefix);
        else
            System.out.println("no common prefix");
    }

}
