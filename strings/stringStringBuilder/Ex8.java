package strings.stringStringBuilder;

public class Ex8 {
    public static void main(String[] args) {
        String s = "If the class name consists of several words they are run together";
        int start = 0, end = 0, length = 0;
        boolean repeat = false;

        for (int i = 0, j = 0; i < s.length(); i++, j = i) {
            while (j != s.length() && s.charAt(j) != ' ')
                j++;
            if (j - i > length) {
                start = i;
                end = j;
                length = j - i;
                repeat = false;
            } else if (j - i == length) {
                repeat = true;
            }
        }

        if (!repeat)
            System.out.println(s.substring(start, end));
    }
}
