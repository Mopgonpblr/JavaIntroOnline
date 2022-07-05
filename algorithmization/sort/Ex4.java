package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[2 + rand.nextInt(10)];
        a[0] = rand.nextInt(10);
        for (int i = 1; i < a.length; i++)
            a[i] = a[i - 1] + rand.nextInt(10);

        System.out.println("Original array:" + Arrays.toString(a));
        int count = 0;
        for (int i = 0; i < a.length - 1; ) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = 0;
                count++;
            } else
                i++;
        }
        System.out.println("Sorted array:" + Arrays.toString(a));
        System.out.println("Replacements: " + count);
    }
}
