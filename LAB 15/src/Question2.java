public class Question2 {
    public static void main(String[] args) {
        for (int j = 2; j <= 998; j++)
            if (checkForPrime(j) == true && checkForPrime(j + 2) == true)
                System.out.println("(" + j + ", " + (j + 2) + ")");
    }

    public static boolean checkForPrime(int num) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                prime = false;
        }
        return prime;
    }

}
