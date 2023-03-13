package classes.simple.ex2;

public class Test2 {
    private int a;
    private int b;

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
        this.a = 1;
        this.b = 3;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return this.b;
    }
}
