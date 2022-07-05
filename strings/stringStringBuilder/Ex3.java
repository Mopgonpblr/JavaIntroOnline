package strings.stringStringBuilder;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Palindrome"));
        System.out.println(isPalindrome("tenet"));
        System.out.println(isPalindrome("1221"));
        System.out.println(isPalindrome("raincoat"));

    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        return true;
    }
}
