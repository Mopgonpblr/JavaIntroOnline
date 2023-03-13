/**
 * 5. Опишите класс, реализующий десятичный счетчик,
 * который может увеличивать или уменьшать свое
 * значение на единицу в заданном диапазоне.
 * Предусмотрите инициализацию счетчика значениями
 * по умолчанию и произвольными значениями. Счетчик
 * имеет методы увеличения и уменьшения состояния,
 * и метод позволяющее получить его текущее
 * состояние. Написать код, демонстрирующий все
 * возможности класса.
 */
package classes.simple.ex5;

public class Ex5 {
    public static void main(String[] args) {
        Counter counter = new Counter(11, 10, 20);
        System.out.println("Current: " + counter.getCurrent());

        counter.increase();
        System.out.println("Increase by 1: " + counter.getCurrent());

        counter.decrease();
        System.out.println("Decrease by 1: " + counter.getCurrent());

        for (int i = 0; i < 20; i++)
            counter.increase();
        System.out.println("Increase by 20: " + counter.getCurrent());

        System.out.println("\nDefault constructor ");
        counter = new Counter();
        System.out.println("\nCurrent: " + counter.getCurrent() +
                "\nLow bar: " + counter.getLowBar() +
                "\nHigh bar: " + counter.getHighBar());

    }
}


