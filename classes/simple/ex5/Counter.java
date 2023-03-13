package classes.simple.ex5;

public class Counter {
    private int current;
    private int lowBar;
    private int highBar;

    public Counter() {
        this.current = 1;
        this.lowBar = 0;
        this.highBar = 10;
    }

    public Counter(int current, int lowBar, int highBar) {
        this.current = current;
        this.lowBar = lowBar;
        this.highBar = highBar;

    }

    public void increase() {
        if (current < highBar)
            current++;
    }

    public void decrease() {
        if (current > lowBar)
            current--;
    }

    public int getCurrent() {
        return current;
    }

    public int getLowBar() {
        return lowBar;
    }

    public int getHighBar() {
        return highBar;
    }
}
