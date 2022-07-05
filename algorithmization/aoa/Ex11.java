package algorithmization.aoa;

import java.util.Arrays;
import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] c = new int[10][20];
        int count = 0;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 20; j++)
                c[i][j] = rand.nextInt(15);
        for (int i = 0; i < 10; i++)
            System.out.println(Arrays.toString(c[i]));

        System.out.print("Strings where number 5 is repeated more than 3 times: ");
        for (int i = 0; i < 10; i++) {
            count = 0;
            for (int j = 0; j < 20; j++) {
                if (c[i][j] == 5)
                    count++;
            }
            if (count >= 3)
                System.out.print(i + 1 + " ");
        }
    }
}
