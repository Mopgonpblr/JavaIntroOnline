package strings.stringStringBuilder;

public class Ex4 {
    public static void main(String[] args) {
        String a = "информатика";
        String b="";

        b = b.concat(String.copyValueOf(a.toCharArray(),7,1)).
                concat(String.copyValueOf(a.toCharArray(),3,2)).
                concat(String.copyValueOf(a.toCharArray(),7,1));

        System.out.println(b);
    }
}
