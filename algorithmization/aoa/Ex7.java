package algorithmization.aoa;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int n = scan.nextInt();
        double[][] a = new double[n][n];
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((Math.pow(i, 2) + Math.pow(j, 2)) / n);
                if (a[i][j] > 0)
                    count++;
            }
        for (int i = 0; i < n; i++)
            System.out.println(Arrays.toString(a[i]));
        System.out.println("Positive numbers: " + count);
    }
}
