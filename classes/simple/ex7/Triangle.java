package classes.simple.ex7;

public class Triangle {
    private int[] a = new int[2];
    private int[] b = new int[2];
    private int[] c = new int[2];

    public Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
        this.a[0] = ax;
        this.a[1] = ay;
        this.b[0] = bx;
        this.b[1] = by;
        this.c[0] = cx;
        this.c[1] = cy;
    }

    private double length(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow((p2[0] - p1[0]), 2) + Math.pow((p2[1] - p1[1]), 2));
    }

    public double area() {
        return Math.sqrt((perimeter() / 2) * (perimeter() / 2 - length(a, b)) *
                (perimeter() / 2 - length(b, c)) * (perimeter() / 2 - length(a, c)));
    }

    public double perimeter() {
        return length(a, b) + length(b, c) + length(a, c);
    }

    public double[] centroid() {
        return new double[]{(double) (a[0] + b[0] + c[0]) / 3, (double) (a[1] + b[1] + c[1]) / 3};
    }
}
