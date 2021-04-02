package strings;

/**
 * 3. В строке найти количество цифр.
 */

public class CharArray3 {
    public static void main(String[] args) {
        char[] a = "па1л3инд9ром0ом.".toCharArray();
        int count = 0;
        for (char c : a) {
            if (Character.isDigit(c))
                count++;
        }
        System.out.println(count);
    }
}
