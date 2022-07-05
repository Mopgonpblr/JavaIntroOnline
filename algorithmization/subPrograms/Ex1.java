package algorithmization.subPrograms;

public class Ex1 {
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a,b);
    }
    private static int gcd(int a, int b) {
        int gcd;
        for (gcd = Math.min(a,b); gcd > 0; gcd--)
            if (a % gcd == 0 && b % gcd == 0)
                break;
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcd(140, 25));
        System.out.println(lcm(140, 25));
    }
}
