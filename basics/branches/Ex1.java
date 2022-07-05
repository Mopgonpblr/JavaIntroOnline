package basics.branches;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Angle 1: ");
        double a = scan.nextDouble();
        System.out.print("Angle 2: ");
        double b = scan.nextDouble();
        double c = 180 - a - b;
        if (c > 0){
            System.out.println("Exists");
            if (a == 90 | b == 90 | c == 90) {
                System.out.println("It's rectangle");
            }
            else
                System.out.println("It's not rectangle");
        }
        else
            System.out.println("It doesn't exist");
    }
}
