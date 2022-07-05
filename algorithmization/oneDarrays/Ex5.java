package algorithmization.oneDarrays;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > i)
                System.out.print(a[i] + " ");
        }
    }
}

