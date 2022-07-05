package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] p = new int[2 + rand.nextInt(10)];
        for (int i = 0; i < p.length; i++)
            p[i] = 1 + rand.nextInt(10);
        int[] q = new int[p.length];
        for (int i = 0; i < q.length; i++)
            q[i] = 2 + rand.nextInt(10);

        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(q));

        int lcm = 1;
        for (int i = 0; i < q.length; i++)
            for (int j = 1; j < Integer.MAX_VALUE; j++)
                if ((q[i] * j) % lcm == 0) {
                    lcm = q[i] * j;
                    break;
                }
        System.out.println(lcm);


        for (int i = 0; i < p.length; i++)
            p[i] *= (lcm / q[i]);
        for (int i = 1; i < p.length; )
            if (p[i] < p[i - 1]) {
                int temp = p[i];
                p[i] = p[i - 1];
                p[i - 1] = temp;
                i = 1;
            } else
                i++;
        Arrays.fill(q, lcm);
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(q));
    }
}
