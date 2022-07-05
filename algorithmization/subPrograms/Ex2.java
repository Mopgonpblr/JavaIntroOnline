package algorithmization.subPrograms;

public class Ex2 {
    private static int gcd(int a, int b, int c, int d) {
        int gcd;
        for (gcd = Math.min(Math.min(a, b), Math.min(c, d)); gcd > 0; gcd--)
            if (a % gcd == 0 && b % gcd == 0 && c % gcd == 0 && d % gcd == 0)
                break;
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcd(125, 25, 50, 75));
    }
}
