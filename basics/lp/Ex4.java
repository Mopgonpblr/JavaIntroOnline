package basics.lp;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r;
        double nnn, ddd;
        System.out.print("R: ");
        r = scan.nextDouble();
        nnn = (int) r;
        ddd = (int) ((r - nnn) * 1000);

        double result = ddd + nnn / 1000;
        System.out.println("Result: " + result);
    }
}
