package basics.cycles;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        do {
            System.out.print("m: ");
            m = scan.nextInt();
            System.out.print("n: ");
            n = scan.nextInt();
        } while (m > n);

        for (int i = m; i < n; i++) {
            System.out.print(i + ": ");
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
