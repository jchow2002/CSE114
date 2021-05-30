
// Jacky Chow CSE114 HW5 Problem1
import java.util.Scanner;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }

    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 of the triangle: ");
        double side3 = scanner.nextDouble();
        System.out.print("Enter the color: ");
        String color = scanner.next();
        System.out.print("Is the triangle filled (Enter true or false)? ");
        boolean filled = scanner.nextBoolean();
        scanner.close();
        Triangle triangle1 = new Triangle(side1, side2, side3);
        triangle1.setColor(color);
        triangle1.setFilled(filled);

        System.out.println();
        System.out.println(triangle1.toString());
        System.out.println("Area is " + triangle1.getArea());
        System.out.println("Perimeter is " + triangle1.getPerimeter());
        System.out.println("Color is " + triangle1.getColor());

        if (triangle1.isFilled())
            System.out.println("Triangle is filled");
        else
            System.out.println("Triangle is not filled");

    }
}
