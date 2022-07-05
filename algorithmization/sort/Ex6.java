package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int n = scan.nextInt();
        Random rand = new Random();
        double[] a = new double[n];
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(10)+rand.nextDouble();

        System.out.println("Original array:" + Arrays.toString(a));
        for (int i = 1; i < a.length - 1; ) {
            if (a[i] <= a[i+1])
                i++;
            else {
                double temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                if (i!=0)
                    i--;
            }
        }
        System.out.println("Sorted array:" + Arrays.toString(a));
    }
}
