package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("K = ");
        int k = scan.nextInt();
        Random rand = new Random();
        int[] a = new int[k + 1 + rand.nextInt(5)];
        int x = a.length;
        for (int i = 0; i < x; i++)
            a[i] = rand.nextInt(10);
        int[] b = new int[x + 1 + rand.nextInt(5)];
        for (int i = 0; i < b.length; i++)
            b[i] = rand.nextInt(10);

        System.out.println("First array:" + Arrays.toString(a));
        System.out.println("Second array:" + Arrays.toString(b));

        a = Arrays.copyOf(a, x + b.length);
        System.arraycopy(a, k, a, k + b.length, x - k);
        System.arraycopy(b, 0, a, k, b.length);

        System.out.println("Combined arrays:" + Arrays.toString(a));
    }
}
