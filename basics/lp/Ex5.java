package basics.lp;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("T: ");
        int t = scan.nextInt();
        int h = t / 3600;
        int m = (t - h * 3600) / 60;
        int s = t - h * 3600 - m * 60;

        System.out.println(h + "ч " + m + "м " + s + "с");
    }
}
