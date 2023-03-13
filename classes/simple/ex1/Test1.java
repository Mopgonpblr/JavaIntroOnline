package classes.simple.ex1;

public class Test1 {
    private int a = 20;
    private int b = 3;

    public void show() {
        System.out.println(a + " " + b);
    }
    public void changeA(int a){
        this.a = a;
    }
    public void changeB(int b){
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int max() {
        return Math.max(a, b);
    }
}