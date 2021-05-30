import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int[] myList = { 1, 2, 3, 4, 5 };
        int temp = myList[0];
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];

        }
        myList[myList.length - 1] = temp;
        System.out.println(Arrays.toString(myList));
    }
}
