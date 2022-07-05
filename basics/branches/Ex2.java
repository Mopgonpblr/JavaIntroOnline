package basics.branches;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        int a = scan.nextInt();
        System.out.print("b: ");
        int b = scan.nextInt();
        System.out.print("c: ");
        int c = scan.nextInt();
        System.out.print("d: ");
        int d = scan.nextInt();

        int max, min1, min2;

        if (a < b)
            min1 = a;
        else
            min1 = b;
        if (c < d)
            min2 = c;
        else
            min2 = d;
        if (min1 > min2)
            max = min1;
        else
            max = min2;
        System.out.println("max {min (a, b), min (c, d)} = " + max);

    }
}
