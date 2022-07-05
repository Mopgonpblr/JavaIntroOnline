package strings.charArray;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        char[] a = "If the class name consists of several words, they are run together (that is, you don’t use underscores to separate the names), and the first letter of each embedded word is capitalized".toCharArray();
        char[] b;
        for (int i = 0; i < a.length; i++)
            if (Arrays.equals(Arrays.copyOfRange(a, i, i + 4), "word".toCharArray())) {
                b = Arrays.copyOf(a, a.length + 2);
                System.arraycopy("letter".toCharArray(), 0, b, i, 6);
                System.arraycopy(a, i + 4, b, i + 6, a.length - i - 4);
                a = b;
            }
        System.out.println(a);
    }
}
