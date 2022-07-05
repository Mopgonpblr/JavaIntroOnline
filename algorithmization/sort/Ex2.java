package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[2 + rand.nextInt(10)];
        a[0] = rand.nextInt(10);
        for (int i = 1; i < a.length; i++)
            a[i] = a[i - 1] + rand.nextInt(10);
        int[] b = new int[2 + rand.nextInt(10)];
        b[0] = rand.nextInt(10);
        for (int i = 1; i < b.length; i++)
            b[i] = b[i - 1] + rand.nextInt(10);

        System.out.println("First array:" + Arrays.toString(a));
        System.out.println("Second array:" + Arrays.toString(b));

        a = Arrays.copyOf(a, a.length + b.length);
        for (int k : b)
            for (int j = 0; j < a.length - 1; j++) {
                if (k <= a[j]) {
                    System.arraycopy(a, j, a, j + 1, a.length - 1 - j);
                    a[j] = k;
                    break;
                }
                if (k > a[j] && a[j + 1] == 0) {
                    a[j + 1] = k;
                    break;
                }
            }
        System.out.println("Combined arrays:" + Arrays.toString(a));
    }
}
