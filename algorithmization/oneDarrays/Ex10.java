package algorithmization.oneDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
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
            if ((i + 1) % 2 == 0)
                a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}


