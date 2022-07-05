package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 2 + rand.nextInt(10), b = 2 + rand.nextInt(10);
        int[][] c = new int[a][b];
        int[] count = new int[b];
        int max = 0;
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                c[i][j] = rand.nextInt(10);
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));


        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++) {
                count[j] += c[i][j];
                if (count[j] > count[max])
                    max = j;
            }
        System.out.println("Sums: " + Arrays.toString(count));
        System.out.println("Max sum is in column No" + (max + 1));
    }
}
