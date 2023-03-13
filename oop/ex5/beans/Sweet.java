package oop.ex5.beans;

public abstract class Sweet {
    private long barCode;
    private String name;
    private int weight;

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.barCode).append(" | ").append(this.name).append(" | ").append(this.weight);
        return sb.toString();
    }
}
