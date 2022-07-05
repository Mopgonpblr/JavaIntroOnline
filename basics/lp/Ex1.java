package basics.lp;

import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        int a = scan.nextInt();
        System.out.print("b: ");
        int b = scan.nextInt();
        System.out.print("c: ");
        int c = scan.nextInt();
        int z = ((a - 3) * b / 2) + c;
        System.out.print("z = " + z);
    }
}
