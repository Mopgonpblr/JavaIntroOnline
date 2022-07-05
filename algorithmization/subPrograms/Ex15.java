package algorithmization.subPrograms;

public class Ex15 {
    public static void findRising(int n) {
        int max = (int) Math.pow(10,n);
        for (int i = max/10; i<max; i++)
            if (isRising(i))
                System.out.println(i);
    }

    public static boolean isRising(int a) {
        int i = a;
        for (int j = a / 10; j > 0; j /= 10) {
            if (i % 10 > j % 10)
                i = j;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        findRising(n);
    }
}
