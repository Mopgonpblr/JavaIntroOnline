package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 2 + rand.nextInt(10), b = 2 + rand.nextInt(10), k, p;
        int[][] c = new int[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                c[i][j] = rand.nextInt(10);
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));

        Scanner scan = new Scanner(System.in);
        System.out.print("k: ");
        do {
            k = scan.nextInt();
        } while (k < 0 | k > a);
        System.out.print("p: ");
        do {
            p = scan.nextInt();
        } while (p < 0 | p > b);
        System.out.println("String k: " + Arrays.toString(c[k - 1]));

        System.out.println("Column p:");

        for (int i = 0; i < a; i++)
            System.out.println(c[i][p - 1]);
    }
}
