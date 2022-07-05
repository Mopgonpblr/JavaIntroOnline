package basics.branches;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.print("x: ");
        int x = scan.nextInt();
        System.out.print("y: ");
        int y = scan.nextInt();
        System.out.print("z: ");
        int z = scan.nextInt();

        if (a * b >= x * y | a * b >= x * z | a * b >= y * z)
            System.out.println("Fits");
        else
            System.out.println("Doesn't fit");
    }
}
