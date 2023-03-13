/**
 * Создать класс Payment с внутренним классом,
 * с помощью объектов которого можно
 * сформировать покупку из нескольких товаров.
 */
package oop.ex2;

public class Ex2 {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addProduct(new Payment.Product("milk", 1.85));
        payment.addProduct(new Payment.Product("bread", 1.43));
        payment.addProduct(new Payment.Product("meat", 6.99));
        payment.addProduct(new Payment.Product("beer", 1.99));
        payment.showList();
        System.out.println("Sum: " + payment.getSum());
    }
}
