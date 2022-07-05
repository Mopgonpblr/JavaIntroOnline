package strings.charArray;

public class Ex3 {
    public static void main(String[] args) {
        char[] a = "Henry offered the Dodge brothers a 10% share in his new company in return for $10000 worth of goods ($325720 in 2021 dollars).".toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if (Character.isDigit(a[i]))
                count++;
        System.out.println(a);
        System.out.println("Number of digits: " + count);

    }
}
