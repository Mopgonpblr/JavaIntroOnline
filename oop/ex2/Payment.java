package oop.ex2;

import java.util.ArrayList;
import java.util.Collection;

public class Payment {
    static class Product {
        private String name;
        private double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String toString() {
            return this.name + " : " + this.price;
        }
    }

    private final Collection<Product> goods = new ArrayList<>();

    public void addProduct(Product product) {
        this.goods.add(product);
    }

    public void showList() {
        System.out.println(goods);
    }

    public double getSum() {
        double sum = 0;
        for (Product product : goods)
            sum += product.price;
        return sum;
    }
}
