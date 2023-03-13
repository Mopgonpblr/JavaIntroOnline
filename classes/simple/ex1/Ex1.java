/**
 * 1. Создайте класс Test1 двумя переменными.
 * Добавьте метод вывода на экран и методы
 * изменения этих переменных. Добавьте метод,
 * который находит сумму значений этих
 * переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */
package classes.simple.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.show();
        System.out.println("Sum: " + t1.sum());
        System.out.println("Max:" + t1.max());
        t1.changeA(13);
        t1.changeB(56);
        t1.show();
    }
}
