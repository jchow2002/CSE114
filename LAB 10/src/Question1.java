public class Question1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int random = ((int) (Math.random() * 100));
            sum += random;
            System.out.println(random);
        }
        double average = sum / 10.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average = " + average);
    }
}
