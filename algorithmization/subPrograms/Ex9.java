package algorithmization.subPrograms;

public class Ex9 {
    private static double area(int x, int y, int z, int t) {
        double d = Math.sqrt(x * x + y * y);
        double s = (z + t + d) / 2;
        return Math.sqrt(s * (s - z) * (s - t) * (s - d)) + (double) (x * y) / 2;
    }

    public static void main(String[] args) {
        System.out.println(area(3,4,3,4));
    }
}
