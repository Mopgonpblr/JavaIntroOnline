package strings;

/**
 * 4. В строке найти количество чисел.
 */

public class CharArray4 {
    public static void main(String[] args) {
        char[] a = "па1л3инд98ром0ом.3".toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i]) && (i + 1 == a.length || !Character.isDigit(a[i + 1])))
                count++;
        }
        System.out.println(count);
    }
}
