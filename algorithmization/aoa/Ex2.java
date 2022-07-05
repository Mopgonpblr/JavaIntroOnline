package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 2+rand.nextInt(10);
        int[][] c = new int[a][a];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < a; j++)
                c[i][j] = rand.nextInt(10);
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(c[i]));

        System.out.println("Diagonal number:");
        System.out.println("Left up to right down:");
        for (int i = 0; i < a; i++) {
            System.out.print(c[i][i] + " ");
        }
        System.out.println("\nRight up to left down:");
        for (int i = 0; i < a; i++) {
            System.out.print(c[i][a-1-i] + " ");
        }
    }
}

