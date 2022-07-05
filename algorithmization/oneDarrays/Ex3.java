package algorithmization.oneDarrays;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = scan.nextDouble();
        }

        int countP = 0, countN = 0, countZ = 0;
        for (double b : a) {
            if (b > 0)
                countP++;
            else if (b < 0)
                countN++;
            else
                countZ++;
        }
        System.out.println("Positive: " + countP);
        System.out.println("Negative: " + countN);
        System.out.println("Zeroes: " + countZ);
    }
}
