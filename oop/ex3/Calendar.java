/**
 * Создать класс Календарь с внутренним классом,
 * с помощью объектов которого можно хранить
 * информацию о выходных и праздничных днях.
 */
package oop.ex3;

import java.util.ArrayList;
import java.util.Collection;

public class Calendar {
    static class Day {
        int monthDay;
        Months month;
        boolean isWeekendDay;
        boolean isHoliday;

        public Day(int monthDay, Months month, boolean isWeekendDay, boolean isHoliday) {
            this.monthDay = monthDay;
            this.month = month;
            this.isWeekendDay = isWeekendDay;
            this.isHoliday = isHoliday;
        }

        public String toString() {
            return this.monthDay + " " + this.month.name() + "\n" +
                    "Weekend: " + isWeekendDay + "\n" +
                    "Holiday: " + isHoliday + "\n";
        }
    }

    private final Collection<Day> calendar = new ArrayList<>();

    public void addDay(Day day) {
        calendar.add(day);
    }

    public void showCalendar() {
        for (Day day:calendar)
            System.out.println(day);
    }
}
