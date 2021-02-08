package algorithmization;

/**
 * 7. Сформировать квадратную матрицу порядка N по правилу:
 * <p>
 * и подсчитать количество положительных элементов в ней.
 */

import java.util.Scanner;


public class ArrOfArr7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("N: ");
        n = scan.nextInt();
        int count = 0;
        double[][] a = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (a[i][j] > 0)
                    count++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println("\n\nNumber of positive elements: " + count);
    }
}
