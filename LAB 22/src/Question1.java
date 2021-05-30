public class Question1 {
    public static void main(String[] args) {
        int[][] arr = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
        sort(arr);
        System.out.print("Sorted array: {");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                System.out.print("{" + arr[i][0] + ", " + arr[i][1] + "} ");
            if (i == arr.length - 1)
                System.out.print("{" + arr[i][0] + ", " + arr[i][1] + "}");
        }
        System.out.println("}");

    }

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            int row = m[i][0];
            int col = m[i][1];
            int index = i;

            for (int j = i + 1; j < m.length; j++) {
                if (row > m[j][0]) {
                    row = m[j][0];
                    col = m[j][1];
                    index = j;
                } else if (row == m[j][0] && col > m[j][1]) {
                    col = m[j][1];
                    index = j;
                }
            }

            if (index != i) {
                m[index][0] = m[i][0];
                m[i][0] = row;
                m[index][1] = m[i][1];
                m[i][1] = col;

            }
        }
    }
}
