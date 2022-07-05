package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 2 + rand.nextInt(10), b = 2 + rand.nextInt(10), c1, c2;
        int[][] c = new int[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                c[i][j] = rand.nextInt(10);
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));

        Scanner scan = new Scanner(System.in);
        System.out.print("Column 1: ");
        do {
            c1 = scan.nextInt();
        } while (c1 < 0 | c1 > b);
        System.out.print("Column 2: ");
        do {
            c2 = scan.nextInt();
        } while (c2 < 0 | c2 > b);

        for (int i = 0; i < a; i++) {
            int temp = c[i][c1 - 1];
            c[i][c1 - 1] = c[i][c2 - 1];
            c[i][c2 - 1] = temp;
        }

        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));
    }
}
