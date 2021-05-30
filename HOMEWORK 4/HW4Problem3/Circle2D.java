public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public double getradius() {
        return radius;
    }

    Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * getradius() * getradius();
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * getradius();
        return perimeter;
    }

    public boolean contains(double x, double y) {
        boolean pointinsideCircle;
        double distance = Math.abs(Math.pow(Math.pow(getx() - x, 2) + Math.pow(gety() - y, 2), 0.5));
        if (distance <= getradius())
            pointinsideCircle = true;
        else
            pointinsideCircle = false;
        return pointinsideCircle;
    }

    public boolean contains(Circle2D c2) {
        boolean circleInsideCirlce;
        double distance = Math.abs(Math.pow(Math.pow(c2.getx() - getx(), 2) + Math.pow(c2.gety() - gety(), 2), 0.5));
        if (getradius() > distance + c2.getradius())
            circleInsideCirlce = true;
        else
            circleInsideCirlce = false;
        return circleInsideCirlce;
    }

    public boolean overlaps(Circle2D c2) {
        boolean circleOverlap;
        double distance = Math.abs(Math.pow(Math.pow(c2.getx() - getx(), 2) + Math.pow(c2.gety() - gety(), 2), 0.5));

        // The question was not specific about whether a circle inside another circle is
        // considered overlapping so I am going to include this line of code that
        // inludes circles that are completely inside the cirlce to be considered
        // overlapping, so please be aware of this. Line 70 can be: if (distance <=
        // c2.getradius() + getradius())

        if (distance <= c2.getradius() + getradius() && !contains(c2))
            circleOverlap = true;
        else
            circleOverlap = false;

        return circleOverlap;
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains((new Circle2D(4, 5, 10.5))));
        System.out.println(c1.overlaps((new Circle2D(3, 5, 2.3))));
    }

}