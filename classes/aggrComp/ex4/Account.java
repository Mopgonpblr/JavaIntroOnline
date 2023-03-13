package classes.aggrComp.ex4;

import java.util.Random;

public class Account {
    private String number;
    private boolean isActive;
    private double sum;

    public Account() {
        generateNumber();
        this.isActive = true;
        this.sum = 0;
    }

    public void generateNumber() {
        Random rand = new Random();
        StringBuilder n = new StringBuilder();
        for (int i = 0; i < 4; i++)
            n.append((rand.nextInt(8999) + 1000));
        this.number = n.toString();
    }


    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("| ").append(this.getNumber()).append(" | ").append(this.isActive()).append(" | ").append(this.getSum()).append(" |");
        return s.toString();
    }
}
