package basics.branches;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A: ");
        System.out.print("x1: ");
        int x1 = scan.nextInt();
        System.out.print("y1: ");
        int y1 = scan.nextInt();

        System.out.println("B: ");
        System.out.print("x2: ");
        int x2 = scan.nextInt();
        System.out.print("y2: ");
        int y2 = scan.nextInt();

        System.out.println("C: ");
        System.out.print("x3: ");
        int x3 = scan.nextInt();
        System.out.print("y3: ");
        int y3 = scan.nextInt();

        double ab = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
        double bc = Math.sqrt(Math.pow(Math.abs(x3 - x2), 2) + Math.pow(Math.abs(y3 - y2), 2));
        double ac = Math.sqrt(Math.pow(Math.abs(x3 - x1), 2) + Math.pow(Math.abs(y3 - y1), 2));

        if (ab + bc == ac | ab + ac == bc | ac + bc == ab)
            System.out.println("One line");
        else
            System.out.println("Several lines");
    }
}
