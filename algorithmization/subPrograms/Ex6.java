package algorithmization.subPrograms;

import java.util.Random;

public class Ex6 {
    private static boolean areEquallySimple(int a, int b, int c) {
        return Math.max(a, b) % Math.min(a, b) != 0 && Math.max(a, c) % Math.min(a, c) != 0
                && Math.max(b, c) % Math.min(b, c) != 0;
    }


    public static void main(String[] args) {
        Random rand = new Random();
        int a = 1 + rand.nextInt(10), b = 1 + rand.nextInt(10), c = 1 + rand.nextInt(10);
        System.out.println(a + " " + b + " " + c);
        System.out.println(areEquallySimple(a, b, c));
    }
}
