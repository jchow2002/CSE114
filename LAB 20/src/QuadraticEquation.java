public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double newa, double newb, double newc) {
        this.a = newa;
        this.b = newb;
        this.c = newc;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return b * b - 4.0 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
    }

}