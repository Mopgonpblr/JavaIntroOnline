/**
 * 10. Создать класс Airline, спецификация
 * которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс,
 * агрегирующий массив типа Airline, с
 * подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести
 * эти данные на консоль.
 * <p>
 * Airline: пункт назначения, номер рейса,
 * тип самолета, время вылета, дни недели.
 * <p>
 * Найти и вывести:
 * a) список рейсов для заданного пункта
 * назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели,
 * время вылета для которых больше заданного.
 */
package classes.simple.ex10;

public class Ex10 {
    public static void main(String[] args) {
        Airline airline1 = new Airline("London", "B2 0834/0841", "737", "11:30:00", "Monday, Friday");
        Airline airline2 = new Airline("Barcelona", "B2 0854/0812", "737/E95", "15:00:00", "Tuesday, Thursday, Sunday");
        Airline airline3 = new Airline("London", "B2 0850/0841", "737", "18:10:00", "Friday, Sunday");

        Airport airport = new Airport(new Airline[]{airline1, airline2, airline3});

        airport.selectDestinationPoint("London");
        System.out.println();

        airport.selectDay("Friday");
        System.out.println();

        airport.selectTime("Sunday", "16:00:00");
    }
}




