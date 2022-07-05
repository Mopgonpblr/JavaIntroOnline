package basics.lp;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("x: ");
        int x = scan.nextInt();
        System.out.print("y: ");
        int y = scan.nextInt();
        if ((y > 0 & y <= 4 & x <= 2 & x >= -2)
                | y <= 0 & y > -3 & x <= 4 & x >= -4
                & !(y == -1 & x == 0))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
