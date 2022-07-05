package strings.stringStringBuilder;

public class Ex9 {
    public static void main(String[] args) {
        String s = "The copyValueOf() method";
        int countUpperCase = 0, countLowerCase = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a < 128) {
                if (Character.isUpperCase(a))
                    countUpperCase++;
                else if (Character.isLowerCase(a))
                    countLowerCase++;
            }
        }
        System.out.println(s);
        System.out.println("Number of upper case letters: " + countUpperCase);
        System.out.println("Number of lower case letters: " + countLowerCase);
    }
}
