import java.util.Scanner;

public class Question2 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the package in pounds: ");
        float weight = scanner.nextFloat();
        scanner.close();

        if (weight <= 0) 
            System.out.println("Invalid input.");
        if (weight > 0 && weight <= 1)
            System.out.println("The shipping cost is $" + 3.5);
        if (weight > 1 && weight <=3)
            System.out.println("The shipping cost is $" + 5.5);
        if (weight > 3 && weight <= 10)
            System.out.println("The shipping cost is $" + 8.5);
        if (weight > 10 && weight <= 20)
            System.out.println("The shipping cost is $" + 10.5);
        if (weight > 20)
            System.out.println("The package cannot be shipped.");
    }
}