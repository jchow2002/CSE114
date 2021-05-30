// Jacky Chow 113268425 CSE114 HW3

import java.util.Scanner;

public class HW3Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int size1 = scanner.nextInt();
        int list1[] = new int[size1];
        for (int i = 0; i < list1.length; ++i) {
            list1[i] = scanner.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int size2 = scanner.nextInt();
        int list2[] = new int[size2];
        for (int i = 0; i < list2.length; ++i) {
            list2[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("List1 is ");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
        }
        System.out.println();
        System.out.print("List2 is ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }
        System.out.println();
        System.out.print("The merged list is ");
        for (int i = 0; i < merge(list1, list2).length; i++) {
            System.out.print(merge(list1, list2)[i] + " ");
        }

    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] combinedList = new int[list1.length + list2.length];
        int position = 0;
        for (int i = 0; i < list1.length; i++) {

            combinedList[position] = list1[i];
            position++;

        }
        for (int i = 0; i < list2.length; i++) {

            combinedList[position] = list2[i];
            position++;
        }

        int temp;
        for (int i = 0; i < combinedList.length; i++) {
            for (int j = 0; j < combinedList.length - 1; j++) {
                if (combinedList[j] > combinedList[j + 1]) {
                    temp = combinedList[j];
                    combinedList[j] = combinedList[j + 1];
                    combinedList[j + 1] = temp;
                }
            }
        }

        return combinedList;
    }
}
