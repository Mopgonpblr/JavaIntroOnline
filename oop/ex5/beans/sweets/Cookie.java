package oop.ex5.beans.sweets;

import oop.ex5.beans.Sweet;

public class Cookie extends Sweet {
    private int number;

    public Cookie() {
        this.setName("Cookies");
        this.setBarCode(269832506580L);
        this.setWeight(750);
        this.number = 20;
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
