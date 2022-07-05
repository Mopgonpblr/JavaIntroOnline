package algorithmization.subPrograms;

public class Ex7 {
    private static int factorial(int a) {
        for (int i = a - 1; i > 0; a *= i, i--) ;
        return a;
    }

    private static int factSum() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0)
                sum += factorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(factSum());
    }
}
