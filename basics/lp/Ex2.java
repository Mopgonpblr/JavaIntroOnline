package basics.lp;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        double a = scan.nextDouble();
        System.out.print("b: ");
        double b = scan.nextDouble();
        System.out.print("c: ");
        double c = scan.nextDouble();
        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)
                - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.print("Result: " + result);
    }
}
