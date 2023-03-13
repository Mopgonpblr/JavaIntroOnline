/**
 * 2. Создйте класс Test2 двумя переменными.
 * Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены
 * класса по умолчанию. Добавьте set- и get-
 * методы для полей экземпляра класса.
 */
package classes.simple.ex2;

public class Ex2 {
    public static void main(String[] args) {
        Test2 t2 = new Test2(13, 15);
        System.out.println("A: " + t2.getA() + " B: " + t2.getB());
        t2 = new Test2();
        System.out.println("Default values:");
        System.out.println("A: " + t2.getA() + " B: " + t2.getB());
        t2.setA(5);
        t2.setB(8);
        System.out.println("Set values:");
        System.out.println("A: " + t2.getA() + " B: " + t2.getB());
    }
}


