package algorithmization.oneDarrays;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scan.nextDouble();
        }

        double max = 0, b = 0;
        for (int i = 0; i < n / 2; i++) {
            b = a[i] + a[n - 1 - i];
            if (b > max)
                max = b;
        }

        System.out.println("Max: " + b);

    }
}
