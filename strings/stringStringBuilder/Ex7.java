package strings.stringStringBuilder;

public class Ex7 {
    public static void main(String[] args) {
        String s = "abc cde def";
        StringBuilder b = new StringBuilder(s);

        for (int i = 0; i < b.length(); i++)
            for (int j = i + 1; j < b.length(); ) {
                if (b.charAt(i) == b.charAt(j) || b.charAt(j) == ' ')
                    b.deleteCharAt(j);
                else
                    j++;
            }
        s = b.toString();

        System.out.println(s);
    }
}
