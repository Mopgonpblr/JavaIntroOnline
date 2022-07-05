package basics.lp;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("x: ");
        double x = scan.nextDouble();
        System.out.print("y: ");
        double y = scan.nextDouble();
        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y))) * Math.tan(x * y);
        System.out.print("Result: " + result);
    }
}
