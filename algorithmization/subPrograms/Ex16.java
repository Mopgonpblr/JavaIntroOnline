package algorithmization.subPrograms;

public class Ex16 {
    public static int findSum(int n) {
        int sum = 0;
        int max = (int) Math.pow(10, n);
        for (int i = max / 10; i < max; i++)
            if (isFullOfNotEven(i))
                sum += i;
        return sum;
    }

    public static boolean isFullOfNotEven(int a) {
        for (int i = a; i > 0; i /= 10) {
            if ((i % 10) % 2 == 0)
                return false;
        }
        //System.out.println(a);
        return true;
    }

    public static int countEven(int a) {
        int count = 0;
        for (int i = a; i > 0; i /= 10) {
            if ((i % 10) % 2 == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        int sum = findSum(n);
        System.out.println("Sum: " + sum);
        System.out.println("Even digits: " + countEven(sum));
    }
}
