package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;

public class Ex16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 3;
        int[][] c = new int[a][a];
        int[] f = new int[a * a];
        int[] s1 = new int[a];
        int[] s2 = new int[a];
        int s3 = 0;
        int s4 = 0;
        int p;
        boolean is = false;
        while (!is) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    do {
                        p = rand.nextInt(a * a);
                    } while (f[p] != 0);
                    c[i][j] = p + 1;
                    f[p] = 1;
                    s1[i] += c[i][j];
                    s2[j] += c[i][j];
                }
                s3 += c[i][i];
                s4 += c[i][a - 1 - i];
            }

            for (int i = 0; i < a; i++) {
                if (s1[i] != s3 | s2[i] != s3 | s4 != s3) {
                    f = new int[a * a];
                    s1 = new int[a];
                    s2 = new int[a];
                    s3 = 0;
                    s4 = 0;
                    break;
                }

                if (i + 1 == a)
                    is = true;
            }
        }
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));
    }
}
