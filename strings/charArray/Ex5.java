package strings.charArray;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        char[] a = "    If the class name    consists of several  words, they are run together (that is, you don’t use underscores to separate the names), and the first letter of each embedded word is capitalized    ".toCharArray();
        char[] b;

        while (a[0] == ' ') {
            b = new char[a.length - 1];
            System.arraycopy(a, 1, b, 0, a.length - 1);
            a = b;
        }
        while (a[a.length - 1] == ' ') {
            b = new char[a.length - 1];
            System.arraycopy(a, 0, b, 0, a.length - 1);
            a = b;
        }

        for (int i = 1; i < a.length; ) {
            if (a[i - 1] == ' ' && a[i] == ' ') {
                b = Arrays.copyOf(a, a.length - 1);
                System.arraycopy(a, i, b, i - 1, a.length - i);
                a = b;
            } else
                i++;

        }
        System.out.println(a);
    }
}
