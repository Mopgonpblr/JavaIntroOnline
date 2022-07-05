package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[rand.nextInt(10)];
        a[0] = rand.nextInt(10);
        for (int i = 1; i < a.length; i++)
            a[i] = a[i - 1] + rand.nextInt(10);

        System.out.println("Original array:" + Arrays.toString(a));

        for (int j = 0; j < a.length; j++) {
            int max = j;
            for (int i = j + 1; i < a.length; i++) {
                if (a[i] > a[max])
                    max = i;
            }
            int temp = a[j];
            a[j] = a[max];
            a[max] = temp;
        }
        System.out.println("Sorted array:" + Arrays.toString(a));
    }
}
