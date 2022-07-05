package basics.cycles;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b = 0;
        do {
            System.out.print("Positive integer number: ");
            a = scan.nextInt();
        } while (a <= 0);
        for (int i = 1; i <= a; b += i++) ;
        System.out.println("Sum: " + b);
    }
}
