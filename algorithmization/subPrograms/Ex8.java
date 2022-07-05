package algorithmization.subPrograms;

import java.util.Arrays;
import java.util.Random;

public class Ex8 {
    private static int calcSum(int[] a, int k, int m) {
        if (k + 2 == m) {
            int sum = 0;
            for (int i = k; i <= m; i++) {
                sum += a[i];
            }
            return sum;
        } else {
            System.out.println("Wrong k and m");
            return 0;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[3 + rand.nextInt(10)];
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(10);
        System.out.println(Arrays.toString(a));
        System.out.println(calcSum(a, 1, 3));
    }
}
