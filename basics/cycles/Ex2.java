package basics.cycles;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, h;
        do {
            System.out.print("a: ");
            a = scan.nextInt();
            System.out.print("b: ");
            b = scan.nextInt();
        } while (a > b);
        System.out.print("h: ");
        h = scan.nextInt();

        System.out.print("y: ");
        for (int x = a; x <= b; x += h) {
            if (x > 2)
                System.out.print(x + " ");
            else
                System.out.print(-x + " ");
        }
    }
}
