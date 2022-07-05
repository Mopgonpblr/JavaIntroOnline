package algorithmization.subPrograms;

public class Ex14 {
    public static int findN(int a) {
        int i = 0;
        for (int j = a; j > 0; i++, j /= 10) ;
        return i;
    }

    public static int findSum(int a) {
        int i = 0;
        for (int j = a; j > 0; j /= 10) {
            i += j % 10;
        }
        return i;
    }

    public static boolean isArmstrong(int a) {
        return Math.pow(findSum(a), findN(a)) == a;
    }

    public static void main(String[] args) {
        int k = 1000;
        for (int i = 1; i < k; i++)
            if (isArmstrong(i))
                System.out.println(i);
    }
}
