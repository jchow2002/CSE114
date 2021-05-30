import java.util.Scanner;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 1;
        denominator = 2;
    }

    public Rational(int numerator, int denominator) {
        int divisor = gcd(numerator, denominator);
        this.numerator = numerator / divisor;
        this.denominator = denominator / divisor;
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Rational add(Rational num2) {
        int num = lcm(num2.getDenominator(), getDenominator());
        int factor1 = num / getDenominator();
        int factor2 = num / num2.getDenominator();
        int numeratoradd = getNumerator() * factor1 + num2.getNumerator() * factor2;
        return new Rational(numeratoradd, num);
    }

    public Rational subtract(Rational num2) {
        int num = lcm(num2.getDenominator(), getDenominator());
        int factor1 = num / getDenominator();
        int factor2 = num / num2.getDenominator();
        int numeratorsubtract = getNumerator() * factor1 - num2.getNumerator() * factor2;
        return new Rational(numeratorsubtract, num);
    }

    public Rational multiply(Rational num2) {
        int denominatormultiply = num2.getDenominator() * getDenominator();
        int numeratormultiply = getNumerator() * num2.getNumerator();
        return new Rational(numeratormultiply, denominatormultiply);
    }

    public Rational divide(Rational num2) {
        int denominatordivide = num2.getNumerator() * getDenominator();
        int numeratordivide = getNumerator() * num2.getDenominator();
        return new Rational(numeratordivide, denominatordivide);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator for the first rational number: ");
        int numerator1 = scanner.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int denominator1 = scanner.nextInt();
        System.out.print("Enter numerator for the second rational number: ");
        int numerator2 = scanner.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        int denominator2 = scanner.nextInt();
        scanner.close();
        Rational num1 = new Rational(numerator1, denominator1);
        Rational num2 = new Rational(numerator2, denominator2);

        System.out.println("First rational number is: " + num1.getNumerator() + "/" + num1.getDenominator());
        System.out.println("Second rational number is: " + num2.getNumerator() + "/" + num2.getDenominator());

        System.out.println("Addition of the rational numbers is: " + num1.add(num2));
        System.out.println("Subtraction of the rational numbers is: " + num1.subtract(num2));
        System.out.println("Multiplication of the rational numbers is: " + num1.multiply(num2));
        System.out.println("Division of the rational numbers is: " + num1.divide(num2));
    }
}
