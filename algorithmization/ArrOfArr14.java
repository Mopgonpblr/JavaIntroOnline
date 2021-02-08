package algorithmization;

/**
 * 14. Сформировать случайную матрицу m x n,
 * состоящую из нулей и единиц, причем в
 * каждом столбце число единиц равно номеру
 * столбца.
 */

import java.util.*;

public class ArrOfArr14 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        int m, n;
        do {
            System.out.print("m: ");
            m = scan.nextInt();
            System.out.print("n: ");
            n = scan.nextInt();
        }
        while (m < n);
        int[][] a = new int[m][n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; ) {
                a[j][i] = ran.nextInt(2);
                if (a[j][i] == 1)
                    count[i]++;
                if ((j + 1) == m && count[i] != i + 1) {
                    j = 0;
                    count[i] = 0;
                } else
                    j++;
            }

        for (int i = 0; i < m; i++) {
            System.out.println("\n");
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
        }
    }
}
