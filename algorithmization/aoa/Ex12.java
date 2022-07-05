package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 2 + rand.nextInt(10), b = 2 + rand.nextInt(10);
        int[][] c = new int[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                c[i][j] = rand.nextInt(10);
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));


        for (int i = 0; i < a; i++)
            for (int j = 1; j < b; j++)
                if (c[i][j - 1] > c[i][j]) {
                    int temp = c[i][j - 1];
                    c[i][j - 1] = c[i][j];
                    c[i][j] = temp;
                    j = 0;
                }
        System.out.println("Sorted by increase:");
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));

        for (int i = 0; i < a; i++)
            for (int j = 1; j < b; j++)
                if (c[i][j - 1] < c[i][j]) {
                    int temp = c[i][j - 1];
                    c[i][j - 1] = c[i][j];
                    c[i][j] = temp;
                    j = 0;
                }
        System.out.println("Sorted by decrease:");
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));
    }
}
