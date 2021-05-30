// Jacky Chow 113268425 CSE114
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Side 3: ");
        int side3 = scanner.nextInt();
        scanner.close();
        
        // detects if it is a valid triangle
        if (side1 + side2 < side3) 
            System.out.println("Invalid Input!");
        else if (side1 + side3 < side2)
            System.out.println("Invalid Input!");
        else if (side2 + side3 < side1)
            System.out.println("Invalid Input!");
        
        // checks for if it is a equilateral triangle
        else
            if (side1 == side2 && side2 == side3)
                System.out.println("Equilateral");
            
        // checks for if it is a isosceles triangle
            else 
                if (side1 == side2 && side1 != side3 && side2 != side3)
                    System.out.println("Isosceles");
                else if (side2 == side3 && side2 != side1 && side3 != side1)
                    System.out.println("Isosceles");
                else if (side1 == side3 && side1 != side2 && side3 != side2)
                    System.out.println("Isosceles");
                
        // checks for if it is a scalene triangle
                else
                    if (side1 != side2 && side2 != side3 && side1 != side3)
                        System.out.println("Scalene");
    }
}