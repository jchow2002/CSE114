// Jacky Chow 113268425 CSE114 HW3

import java.util.Scanner;

public class HW3Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 10 integers: ");
        int x[] = new int[10];
        for (int i = 0; i < x.length; ++i) {
            x[i] = scanner.nextInt();
        }
        scanner.close();
        int[] output = eliminateDuplicates(x);
        System.out.print("The distinct integers are: ");
        for (int i = 0; i < output.length; i++)
            System.out.print(output[i] + " ");

    }

    public static int[] eliminateDuplicates(int[] list) {

        int position = 0;
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    break;
                }
            }
        }
        int[] newList = new int[list.length - count];

        for (int i = 0; i < list.length; i++) {
            boolean flag = false;
            for (int j = 0; j < position; j++) {
                if (list[i] == newList[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                newList[position] = list[i];
                position++;
            }
        }

        return newList;

    }
}
