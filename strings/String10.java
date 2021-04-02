package strings;

/**
 * 10. Строка X состоит из нескольких предложений,
 * каждое из которых кончается точкой, восклицательным
 * или вопросительным знаком. Определить количество
 * предложений в строке X.
 */

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        System.out.println("String:");
        Scanner scan = new Scanner(System.in);
        StringBuilder x =new StringBuilder( scan.nextLine());

        int count=0;
        for (int i = 0; i < x.length(); i++) {
            if (x.substring(i,i+1).matches("[!?.]"))
                count++;

        }
        System.out.println(count);
    }
}
