package algorithmization;

/**
 * 4. Даны действительные числа а1 ,а2 ,..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */

import java.util.*;


public class Arrays4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = scan.nextInt();
        float[] a = new float[n];
        int max_index = 0;
        int min_index = 0;
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(150) - 100 + rand.nextFloat();
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            if (a[i] > a[max_index])
                max_index = i;
            if (a[i] < a[min_index])
                min_index = i;
        }
        float temp = a[max_index];
        a[max_index] = a[min_index];
        a[min_index] = temp;
        System.out.println(Arrays.toString(a));

    }
}
