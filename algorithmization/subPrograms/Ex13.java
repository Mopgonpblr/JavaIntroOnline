package algorithmization.subPrograms;

import java.util.Arrays;

public class Ex13 {
    private static int[] getTwins(int i, int n) {
        if (n > 2 && i >= n && i + 2 <= n * 2)
            return new int[]{i, i + 2};
        else
            return new int[0];
    }

    private static int[][] findAllTwins(int n) {
        int[][] twins = new int[n-1][2];
        for (int j = 0, i = n; getTwins(i, n).length != 0; j++, i++)
            twins[j] = getTwins(i, n);
        return twins;
    }


    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i < findAllTwins(n).length; i++) {
            System.out.println(Arrays.toString(findAllTwins(n)[i]));
        }
    }

}
