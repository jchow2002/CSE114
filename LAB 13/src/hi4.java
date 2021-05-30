public class hi4 {
    public static void main(String[] args) {
        String string = "hello";
        String result = "";

        char x = '\u043'; 

        System.out.println(x++);

        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0)
                result = result + string.substring(i, i + 1);
        }
        System.out.println(result);
        System.out.println(y);

    }
}