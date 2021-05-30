import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = new int[100];
        System.out.println("Enter the integers between 1 and 100: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
            if (list[i] == 0)
                break;
        }
        scanner.close();
        // System.out.println(Arrays.toString(list));
        for (int i = 1; i <= list.length; i++) {
            int counter = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[j] == i)
                    counter += 1;
            }

            if (counter != 0) {

                if (counter == 1)
                    System.out.println(i + " occurs " + counter + " time.");
                else if (counter > 1)
                    System.out.println(i + " occurs " + counter + " times.");
            }
        }
    }

}
