package algorithmization.oneDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scan.nextDouble();
        }

        System.out.print("Z: ");
        double z = scan.nextDouble();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > z) {
                a[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Replacements: " + count);

    }
}

