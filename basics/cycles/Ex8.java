package basics.cycles;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        int a = scan.nextInt();
        System.out.print("b: ");
        int b = scan.nextInt();
        boolean isInside, isInside2;
        System.out.print("Common numbers: ");
        for (int i = 0; i < 10; i++) {
            isInside = false;
            isInside2 = false;
            for (int j = a; j != 0; j /= 10) {
                if (j % 10 == i) {
                    isInside = true;
                    break;
                }
            }
            for (int k = b; k != 0; k /= 10) {
                if (k % 10 == i) {
                    isInside2 = true;
                    break;
                }
            }
            if (isInside && isInside2)
                System.out.print(i + " ");
        }
    }
}
