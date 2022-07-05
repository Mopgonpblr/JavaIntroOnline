package basics.cycles;

public class Ex3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; sum += Math.pow(i++, 2)) ;
        System.out.println("Sum: " + sum);
    }
}
