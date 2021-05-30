// Jacky Chow 113268425 CSE114 HW3

import java.util.Scanner;

public class HW3Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 strings: ");
        String[] cities = new String[10];

        for (int i = 0; i < cities.length; i++) {
            cities[i] = scanner.nextLine();
        }
        scanner.close();

        System.out.print("Sorted strings: ");
        for (int i = 0; i < cities.length - 1; i++) {
            System.out.print(bubbleSort(cities)[i] + ", ");
        }
        for (int i = cities.length - 1; i < cities.length; i++)
            System.out.print(bubbleSort(cities)[i]);
    }

    public static String[] bubbleSort(String[] list) {
        String temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}