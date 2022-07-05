package algorithmization.subPrograms;

public class Ex11 {
    private static void moreDigits(int a, int b) {
        int length1, length2;
        int a1 = a;
        int b1 = b;
        for (length1 = 0; a1 > 0; a1 /= 10, length1++) ;
        for (length2 = 0; b1 > 0; b1 /= 10, length2++) ;

        if (length1 > length2)
            System.out.println(a + " has more digits");
        else if (length1 < length2)
            System.out.println(b + " has more digits");
        else System.out.println(a + " and " + b + " have equal digits number");
    }

    public static void main(String[] args) {
        moreDigits(123, 45);
        moreDigits(132, 4589);
        moreDigits(125, 452);
    }
}
