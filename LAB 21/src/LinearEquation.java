import java.util.Scanner;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getX() {
        return (e * d - b * f) / adMinusbc();
    }

    public double getY() {
        return (a * f - e * c) / adMinusbc();
    }

    public boolean cantSolve() {
        return adMinusbc() == 0;
    }

    private double adMinusbc() {
        return a * d - b * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        scanner.close();
        LinearEquation l1 = new LinearEquation(a, b, c, d, e, f);
        if (!l1.cantSolve()) {

            System.out.println("X is " + l1.getX() + " Y is " + l1.getY());
        } else
            System.out.println("The equation has no solutions.");
    }
}
