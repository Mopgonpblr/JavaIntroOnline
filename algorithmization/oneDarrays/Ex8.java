package algorithmization.oneDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scan.nextInt();
        }


        int min = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < a[min])
                min = i;
        }
        int n2 = n;
        for (int c : a) {
            if (c == a[min])
                n2--;
        }
        int[] b = new int[n2];
        for (int i = 0, j = 0; i < n; i++) {
            if (a[i] != a[min]) {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
