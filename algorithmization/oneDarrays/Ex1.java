package algorithmization.oneDarrays;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            do {
                a[i] = scan.nextInt();
            } while (a[i] < 0);
        }

        System.out.print("K: ");
        int k = scan.nextInt();

        int sum = 0;
        for (int b : a) {
            if (b % k == 0)
                sum += b;
        }
        System.out.println("Sum: " + sum);
    }
}
