package basics.branches;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("x: ");
        int x = scan.nextInt();

        System.out.print("F(x) = ");
        if (x <= 3) {
            System.out.println(Math.pow(x, 2) - 3 * x + 9);
        } else
            System.out.println(1 / (Math.pow(x, 3) + 6));
    }
}
