/**
 * 6. Составьте описание класса для представления
 * времени. Предусмотрте возможности установки
 * времени и изменения его отдельных полей (час,
 * минута, секунда) с проверкой допустимости
 * вводимых значений. В случае недопустимых
 * значений полей поле устанавливается в значение
 * 0. Создать методы изменения времени на заданное
 * количество часов, минут и секунд.
 */
package classes.simple.ex6;

public class Ex6 {
    public static void main(String[] args) {
        Clock clock = new Clock(13,12,56);
        System.out.println(clock.getTime());

        System.out.println("\nChange minutes to 5");
        clock.setMinutes(5);
        System.out.println(clock.getTime());

        System.out.println("\nChange hours to 25");
        clock.setHours(25);
        System.out.println(clock.getTime());

        System.out.println("\nChange time to 23:59:60");
        clock.setTime(23,59,60);
        System.out.println(clock.getTime());
    }
}


