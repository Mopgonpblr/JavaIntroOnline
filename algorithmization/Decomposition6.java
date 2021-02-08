package algorithmization;

import java.util.Scanner;

/**
 * 6. Написать метод(методы), проверяющий,
 * являются ли данные три числа взаимно простыми.
 */
public class Decomposition6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.print("C: ");
        int c = scan.nextInt();

        System.out.println(checkSimple(a, b, c));
    }

    private static boolean checkSimple(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (array[i] != array[j] && array[i] != 1 && array[j] != 1)
                    if (array[i] % array[j] == 0)
                        return false;
        return true;
    }
}
