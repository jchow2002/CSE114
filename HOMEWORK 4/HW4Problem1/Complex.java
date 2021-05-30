import java.util.Scanner;

public class Complex {
    private double RealPart;
    private double ImaginaryPart;

    // no arg constructor
    public Complex() {

    }

    // arg constructor + setter
    public Complex(double realPart, double imaginaryPart) {
        this.RealPart = realPart;
        this.ImaginaryPart = imaginaryPart;
    }

    // getter
    public double getRealPart() {
        return RealPart;
    }

    // getter
    public double getImaginaryPart() {
        return ImaginaryPart;
    }

    public Complex sum(Complex c2) {

        double realsum = getRealPart() + c2.getRealPart();
        double imaginarysum = getImaginaryPart() + c2.getImaginaryPart();

        return new Complex(realsum, imaginarysum);
    }

    public Complex difference(Complex c2) {

        double realdifference = getRealPart() - c2.getRealPart();
        double imaginarydifference = getImaginaryPart() - c2.getImaginaryPart();

        return new Complex(realdifference, imaginarydifference);
    }

    public String toString() {
        return "(" + RealPart + ", " + ImaginaryPart + ")";
    }

    public static String difference(double real1, double imaginary1, double real2, double imaginary2) {

        double realsum = real1 - real2;
        double imaginarysum = imaginary1 - imaginary2;
        String ans2 = "Subtraction of the complex numbers is: (" + realsum + ", " + imaginarysum + ")";
        return ans2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();
        System.out.print("Enter real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();
        scanner.close();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        System.out.println("First complex number is: (" + c1.getRealPart() + ", " + c1.getImaginaryPart() + ")");
        System.out.println("Second complex number is: (" + c2.getRealPart() + ", " + c2.getImaginaryPart() + ")");

        System.out.println("Addition of the complex numbers is: " + c1.sum(c2));
        System.out.println("Subtraction of the complex numbers is: " + c1.difference(c2));

    }

}
