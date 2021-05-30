import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        int[] score = new int[numOfStudents];
        System.out.println("Enter " + numOfStudents + " scores: ");
        for (int i = 0; i < numOfStudents; i++) {
            score[i] = scanner.nextInt();

        }
        scanner.close();
        // System.out.println(Arrays.toString(score));

        int best = 0;
        for (int j = 0; j < score.length; j++) {
            if (score[j] > best)
                best = score[j];
        }
        // System.out.println(best);

        String letter;
        for (int k = 0; k < score.length; k++) {

            if (score[k] >= best - 10)
                letter = "A";
            else if (score[k] >= best - 20)
                letter = "B";
            else if (score[k] >= best - 30)
                letter = "C";
            else if (score[k] >= best - 40)
                letter = "D";
            else
                letter = "F";
            System.out.println("Student " + k + " is " + score[k] + " and grade is " + letter);
        }

    }

}
