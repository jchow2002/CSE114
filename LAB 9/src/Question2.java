public class Question2 {
    public static void main(String[] args) {
        char letter1 = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
        char letter2 = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
        char letter3 = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
        int number = (int) (1000 + Math.random() * 9000);
        System.out.println("Plate: " + letter1 + letter2 + letter3 + number);
    }
}