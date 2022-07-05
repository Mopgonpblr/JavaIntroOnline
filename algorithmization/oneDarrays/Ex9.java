package algorithmization.oneDarrays;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scan.nextInt();
        }


        int min = a[0], maxCount = 0, count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i; j < n; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count > maxCount || (count == maxCount && a[i] < min)) {
                min = a[i];
                maxCount = count;
            }
        }
        System.out.println("Number: " + min);
        System.out.println("Repeats " + maxCount + " times");
    }
}
