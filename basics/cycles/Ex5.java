package basics.cycles;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int n = scan.nextInt();
        System.out.print("e: ");
        double e = scan.nextDouble();
        double sum = 0, a;

        for (int i = 1; i < n; i++) {
            a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (Math.abs(a) >= e)
                sum += a;
        }
        System.out.println("Sum: " + sum);
    }
}
