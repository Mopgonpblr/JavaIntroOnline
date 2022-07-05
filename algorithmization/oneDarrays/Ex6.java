package algorithmization.oneDarrays;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Size: ");
        int s = scan.nextInt();
        double[] n = new double[s];

        for (int i = 0; i < s; i++) {
            System.out.print("N[" + i + "]: ");
            n[i] = scan.nextDouble();
        }

        int sum = 0;
        for (int i = 0; i < s; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
                if (j > i / 2) {
                    sum += n[i];
                    break;
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
}
