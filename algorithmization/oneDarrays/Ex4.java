package algorithmization.oneDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scan.nextDouble();
        }

        int max = 0, min = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > a[max])
                max = i;
            if (a[i] < a[min])
                min = i;
        }

        double temp = a[max];
        a[max] = a[min];
        a[min] = temp;

        System.out.println(Arrays.toString(a));

    }
}
