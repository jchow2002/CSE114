public class Question2 {
    public static void main(String[] args) {
        int upperlimit = 20;
        System.out.println("The sum of adding " + upperlimit + " times is " + sum(upperlimit));

        System.out.println("i\tm(i)");
        for (double i = 1; i <= upperlimit; i++) {
            String formattedi = String.format("%.0f", i);
            String formattedsum = String.format("%.4f", sum(i));
            System.out.println(formattedi + "\t" + formattedsum);

        }
    }

    public static double sum(double i) {
        double sum = 0;
        for (double lowercount = 1; lowercount <= i; lowercount++)
            sum = sum + (lowercount / (lowercount + 1));
        return sum;
    }

}
