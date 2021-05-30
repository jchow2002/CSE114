public class Question2 {
    public static void main (String[] args) {
        // Min + Math.random() * (Max - Min + 1)
        char letters = (char)('a' + Math.random() * ('z' - 'a' + 1));
        System.out.println(letters);
    }
}
