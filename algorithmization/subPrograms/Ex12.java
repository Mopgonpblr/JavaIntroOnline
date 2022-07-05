package algorithmization.subPrograms;

import java.util.Arrays;
import java.util.Random;

public class Ex12 {
    private static int[] newArray(int k, int n) {
        Random rand = new Random();
        int[] a = new int[2 + rand.nextInt(10)];
        for (int i = 0; i < a.length; i++){
            do{
            a[i] = rand.nextInt(n);
            }while (!checkNumber(a[i], k));
        }
        return a;
    }

    private static boolean checkNumber(int a, int k) {
        int sum;
        for (sum = 0; a > 0; a /= 10) {
            sum += a % 10;
        }
        return sum == k;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(newArray(12,100)));
    }
}
