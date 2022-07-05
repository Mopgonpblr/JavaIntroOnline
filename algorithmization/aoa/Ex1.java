package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 2+rand.nextInt(10), b = 2+rand.nextInt(10);
        int[][] c = new int[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                c[i][j] = rand.nextInt(10);
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));

        System.out.println("Columns:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                if ((j + 1) % 2 != 0 && c[0][j] > c[a - 1][j])
                    System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
