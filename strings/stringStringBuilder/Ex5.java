package strings.stringStringBuilder;

public class Ex5 {
    public static void main(String[] args) {
        String a = "If the class name consists of several words, they are run together (that is, you don’t use underscores to separate the names), and the first letter of each embedded word is capitalized";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a')
                count++;
        }
        System.out.println(a);
        System.out.println("Number of 'a' letters: " + count);
    }
}
