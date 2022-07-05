package strings.charArray;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        char[][] a = new char[][]{"newArray".toCharArray(), "camelCase".toCharArray(), "intNumber".toCharArray()};
        char[] b;

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                if (Character.isUpperCase(a[i][j])) {
                    b = Arrays.copyOf(a[i], a[i].length + 1);
                    b[j] = '_';
                    System.arraycopy(a[i], j, b, j + 1, a[i].length - j);
                    b[j + 1] = Character.toLowerCase(b[j + 1]);
                    a[i] = b;
                }
            }

        for (char[] chars : a) System.out.println(chars);
    }
}
