package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;

public class Ex14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 2 + rand.nextInt(10), m = n + 1 + rand.nextInt(5);
        int[][] c = new int[m][n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; ) {
                if (count < i + 1) {
                    c[j][i] = rand.nextInt(2);
                    if (c[j][i] == 1)
                        count++;
                    if (j + 1 == m) {
                        for (j = 0; j < m; j++)
                            c[j][i] = 0;
                        j = 0;
                        count = 0;
                    } else
                        j++;
                } else if (count > i + 1) {
                    for (j = 0; j < m; j++)
                        c[j][i] = 0;
                    j = 0;
                    count = 0;
                } else
                    break;
            }
        }
        for (int i = 0; i < m; i++)
            System.out.println(Arrays.toString(c[i]));

    }
}
