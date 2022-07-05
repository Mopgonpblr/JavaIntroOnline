package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Ex7 {
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

        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i++)
            for (int j = 1; j < a.length; j++) {
                if (b[i] > a[j-1] && b[i] <= a[j]) {
                    c[i] = j;
                    break;
                }
                if (j + 1 == a.length)
                    c[i] = j + 1;
            }
        System.out.println("Places:" + Arrays.toString(c));
    }
}
