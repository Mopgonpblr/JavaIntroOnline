package algorithmization.subPrograms;

import java.util.Arrays;

public class Ex10 {
    private static int[] newArray(int a) {
        int length;
        int b = a;
        for (length = 0; b > 0; b /= 10, length++) ;
        int[] array = new int[length];
        for (int i = length-1; i >= 0; i--) {
            array[i] = a % 10;
            a /= 10;
        }
        return array;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Arrays.toString(newArray(n)));
    }
}
