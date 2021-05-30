public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1)
            return false;
        for (int i = 2; i < value; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger num1) {
        return num1.isEven();
    }

    public static boolean isOdd(MyInteger num1) {
        return num1.isOdd();
    }

    public static boolean isPrime(MyInteger num1) {
        return num1.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    public static void main(String[] arg) {
        MyInteger num1 = new MyInteger(4);
        MyInteger num2 = new MyInteger(5);
        MyInteger num3 = new MyInteger(7);

        System.out.println("Is " + num1.getValue() + " odd? " + num1.isOdd());
        System.out.println("Is " + num1.getValue() + " even? " + num1.isEven());
        System.out.println("Is " + num1.getValue() + " prime? " + num1.isPrime());
        System.out.println();
        System.out.println("Is " + num2.getValue() + " odd? " + num2.isOdd());
        System.out.println("Is " + num2.getValue() + " even? " + num2.isEven());
        System.out.println("Is " + num2.getValue() + " prime? " + num2.isPrime());
        System.out.println();
        System.out.println("Is " + num3.getValue() + " odd? " + num3.isOdd());
        System.out.println("Is " + num3.getValue() + " even? " + num3.isEven());
        System.out.println("Is " + num3.getValue() + " prime? " + num3.isPrime());
        System.out.println();
        System.out.println("Is " + num1.getValue() + " = " + num2.getValue() + "? " + num1.equals(num2));
        System.out.println("Is " + num2.getValue() + " = " + num3.getValue() + "? " + num2.equals(num3));
        System.out.println("Is " + num1.getValue() + " = " + num3.getValue() + "? " + num1.equals(num3));
    }

}