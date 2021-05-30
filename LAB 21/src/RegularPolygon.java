public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int numberOfSides, double sideLength) {
        this();
        side = sideLength;
        n = numberOfSides;
    }

    public RegularPolygon(int numberOfSides, double sideLength, double x, double y) {
        this(numberOfSides, sideLength);
        this.x = x;
        this.y = y;
    }

    public int getn() {
        return n;
    }

    public void setn(int n) {
        this.n = n;
    }

    public double getside() {
        return side;
    }

    public void setside(double side) {
        this.side = side;
    }

    public double gety() {
        return y;
    }

    public void sety(double y) {
        this.y = y;
    }

    public double getx() {
        return x;
    }

    public void setx(double x) {
        this.x = x;
    }

    public double getPerimeter() {

        return n * side;
    }

    public double getArea() {

        return (n * side * side) / (4.0 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1: Perimeter is " + regularPolygon1.getPerimeter() + " and Area is "
                + regularPolygon1.getArea());
        System.out.println("Polygon 2: Perimeter is " + regularPolygon2.getPerimeter() + " and Area is "
                + regularPolygon2.getArea());
        System.out.println("Polygon 2: Perimeter is " + regularPolygon3.getPerimeter() + " and Area is "
                + regularPolygon3.getArea());

    }
}
