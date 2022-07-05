package strings.charArray;

public class Ex4 {
    public static void main(String[] args) {
        char[] a = "2Henry offered the Dodge brothers a 10% share in his new company in return for $10000 worth of goods ($325720 in 2021 dollars).14".toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if (Character.isDigit(a[i])) {
                while (Character.isDigit(a[i]) && i < a.length - 1)
                    i++;
                count++;
            }
        System.out.println(a);
        System.out.println("Numbers: " + count);
    }
}