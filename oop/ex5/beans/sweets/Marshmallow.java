package oop.ex5.beans.sweets;

import oop.ex5.beans.Sweet;

public class Marshmallow extends Sweet {
    private int number;

    public Marshmallow() {
        this.setName("Marshmallow");
        this.setBarCode(36983236580L);
        this.setWeight(500);
        this.number = 8;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getBarCode()).append(" | ").append(this.getName()).append(" | ").append(this.getWeight()).append(" | ").append(this.number);
        return sb.toString();
    }
}
