package oop.ex4;

public class Treasure {
    private String name;
    private int price;

    public Treasure() {
        this.name = "empty";
        this.price = 0;
    }

    public Treasure(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return this.name + " | " + this.price;
    }
}
