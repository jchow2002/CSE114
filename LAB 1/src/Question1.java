import java.lang.Math;

public class Question1 {

    public static void main(String[] args) {

        double radius = 5.5;
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
