public class Question1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 width: " + rectangle1.width);
        System.out.println("Rectangle 1 height: " + rectangle1.height);
        System.out.println("Rectangle 1 area: " + rectangle1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + rectangle1.getPerimeter() + "\n");
        System.out.println("Rectangle 2 width: " + rectangle2.width);
        System.out.println("Rectangle 2 height: " + rectangle2.height);
        System.out.println("Rectangle 2 area: " + rectangle2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + rectangle2.getPerimeter());

    }
}
