public class Question1 {
    public static void main(String[] args) {
        int[] list = new int[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (i == list[j])
                    count++;
            }
            System.out.println(i + "'s count is: " + count);
        }

    }
}
