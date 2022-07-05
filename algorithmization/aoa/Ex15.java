package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;

public class Ex15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 2 + rand.nextInt(10), b = 2 + rand.nextInt(10);
        int[][] c = new int[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                c[i][j] = rand.nextInt(10);
        int max = c[0][0];
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));

        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                if (c[i][j] > max)
                    max = c[i][j];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                if (c[i][j] % 2 != 0)
                    c[i][j] = max;

        System.out.println("Not even numbers are replaced by the max one:");
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));
    }
}
