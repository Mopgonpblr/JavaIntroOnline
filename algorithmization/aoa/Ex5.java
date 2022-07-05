package algorithmization.aoa;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        do {
            n = scan.nextInt();
        } while (n % 2 != 0);

        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - i; j++)
                c[i][j] = i + 1;
        for (int i = 0; i < n; i++)
            System.out.println(Arrays.toString(c[i]));
    }
}
