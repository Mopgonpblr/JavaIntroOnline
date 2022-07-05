package strings.stringStringBuilder;

public class Ex6 {
    public static void main(String[] args) {
        String a = "If the class name consists of several words, they are run together (that is, you don’t use underscores to separate the names), and the first letter of each embedded word is capitalized";
        StringBuilder b = new StringBuilder(a);

        for (int i = 0; i < a.length(); i++) {
            b.insert(i * 2, a.charAt(i));
        }
        System.out.println(b);
    }
}
