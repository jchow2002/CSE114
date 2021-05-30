public class Question1 {
    public static void main(String[] args) {

        double sum = 0;
        for (double i = 1; i <= 97; i = i + 2) {
            // System.out.println(i);
            // System.out.println(i + 2);
            sum = sum + (i / (i + 2));
        }

        System.out.println(sum);
    }
}
