package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 2 + rand.nextInt(10);
        int[][] c = new int[a][a];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < a; j++)
                c[i][j] = rand.nextInt(10)-5;
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));

        System.out.println("Positive numbers of the main diagonal:");
        for (int i = 0; i < a; i++) {
            if (c[i][i] > 0)
                System.out.print(c[i][i] + " ");
        }
    }
}
