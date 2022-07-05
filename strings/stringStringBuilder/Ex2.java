package strings.stringStringBuilder;

public class Ex2 {
    public static void main(String[] args) {
        String a = "If the class name consists of several words, they are run together (that is, you don’t use underscores to separate the names), and the first letter of each embedded word is capitalized";
        StringBuilder b = new StringBuilder(a);

        for (int i = 0; i < b.length(); i++)
            if (b.charAt(i) == 'a')
                b.insert(i+1, 'b');
        System.out.println(b);
    }
}
