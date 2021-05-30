import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = scanner.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = scanner.nextLine();
        scanner.close();

        // city 1 as the lowest letter
        if (city1.charAt(0) < city2.charAt(0) && city1.charAt(0) < city3.charAt(0) && city2.charAt(0) < city3.charAt(0))
            System.out.println(
                    "The three cities in alphabetical order are: " + city1 + " " + city2 + " " + city3 + " here1");
        if (city1.charAt(0) < city2.charAt(0) && city1.charAt(0) < city3.charAt(0) && city3.charAt(0) < city2.charAt(0))
            System.out.println(
                    "The three cities in alphabetical order are: " + city1 + " " + city3 + " " + city2 + " here2");

        // city 2 as the lowest letter
        if (city2.charAt(0) < city1.charAt(0) && city2.charAt(0) < city3.charAt(0) && city1.charAt(0) < city3.charAt(0))
            System.out.println(
                    "The three cities in alphabetical order are: " + city2 + " " + city1 + " " + city3 + " here3");
        if (city2.charAt(0) < city1.charAt(0) && city2.charAt(0) < city3.charAt(0) && city3.charAt(0) < city1.charAt(0))
            System.out.println(
                    "The three cities in alphabetical order are: " + city2 + " " + city3 + " " + city1 + " here4");

        // city 3 as the lowest letter
        if (city3.charAt(0) < city2.charAt(0)
                && (city3.charAt(0) < city1.charAt(0) && city1.charAt(0) < city2.charAt(0)))
            System.out.println(
                    "The three cities in alphabetical order are: " + city3 + " " + city1 + " " + city2 + " here5");
        if (city3.charAt(0) < city2.charAt(0) && city3.charAt(0) < city1.charAt(0) && city2.charAt(0) < city1.charAt(0))
            System.out.println(
                    "The three cities in alphabetical order are: " + city3 + " " + city2 + " " + city1 + " here6");

    }
}
