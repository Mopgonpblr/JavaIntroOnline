package algorithmization.subPrograms;

public class Ex17 {
    public static int findSum(int a) {
        int sum = 0;
        for (int i = a; i > 0; i /= 10)
            sum += i % 10;
        return sum;
    }

    public static int countSubtractions(int a) {
        int count = 0;
        for (int i = a; i != 0; i -= findSum(i)) {
            //System.out.println(i + " " + findSum(i) + " " + count);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(countSubtractions(n));
    }
}
