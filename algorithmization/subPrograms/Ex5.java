package algorithmization.subPrograms;

import java.util.Arrays;
import java.util.Random;

public class Ex5 {
    private static int preMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        int preMax = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > preMax && a[i] < max)
                preMax = a[i];
        }
        return preMax;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[2 + rand.nextInt(10)];
        for (int i = 0; i < a.length; i++)
            a[i] = 1 + rand.nextInt(10);
        System.out.println(Arrays.toString(a));
        System.out.println(preMax(a));
    }
}
