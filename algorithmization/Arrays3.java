package algorithmization;

/**
 * 3. Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и
 * нулевых элементов.
 */

import java.util.*;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = scan.nextInt();
        float[] a = new float[n];
        int count_negative = 0;
        int count_positive = 0;
        int count_zeroes = 0;
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextFloat() + rand.nextInt(150) - 100;
            if (a[i] < 0)
                count_negative++;
            else if (a[i] > 0)
                count_positive++;
            else
                count_zeroes++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Negative: " + count_negative + ". Positive: " + count_positive + ". Zeroes: " + count_zeroes);
    }
}
