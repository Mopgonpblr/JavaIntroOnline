/**
 * 8. Создать класс Customer, спецификация
 * которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с
 * подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести
 * эти данные на консоль.
 * <p>
 * Класс Customer: id, фамилия, имя, отчество,
 * адрес, номер кредитной карточки, номер
 * банковского счета.
 * <p>
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер
 * кредитной карточки находится в заданном
 * интервале
 */
package classes.simple.ex8;

public class Ex8 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(12, "Smith", "John", "Michael", "39 Baker St.", 4567_8555_8132_2583L, 684351456765L);
        Customer customer2 = new Customer(15, "Simpson", "Anthony", "Louis", "13 Green St.", 6585_6556_5632_5123L, 5645456465465L);
        Customer customer3 = new Customer(19, "Garrison", "Randall", "Jack", "3 Washington Av.", 5835_3656_1622_2323L, 5645456465465L);
        Shop shop = new Shop(new Customer[]{customer1, customer2, customer3});

        shop.sortPrint();
        System.out.println();

        shop.printRange(1234_5678_9123_4567L, 6585_6556_5632_5120L);
    }
}




