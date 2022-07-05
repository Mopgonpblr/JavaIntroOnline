package algorithmization.subPrograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {

    private static double length(int[] a, int[] b) {
        return Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2));
    }

    private static int[][] maxLength(int[][] a) {
        int[][] max = new int[2][2];
        for (int[] point1 : a)
            for (int[] point2 : a) {
                if (length(point1, point2) > length(max[0], max[1])) {
                    max[0] = point1;
                    max[1] = point2;
                }
            }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N = ");
        int n = scan.nextInt();
        Random rand = new Random();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = -5 + rand.nextInt(10);
        for (int i = 0; i < n; i++)
            System.out.println(Arrays.toString(a[i]));

        System.out.println("Max length: ");
        for (int i = 0; i < 2; i++)
            System.out.println(Arrays.toString(maxLength(a)[i]));
    }
}
