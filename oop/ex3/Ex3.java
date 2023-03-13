package oop.ex3;

public class Ex3 {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.addDay(new Calendar.Day(31,Months.OCTOBER,false,true));
        calendar.addDay(new Calendar.Day(8,Months.NOVEMBER,false,false));
        calendar.addDay(new Calendar.Day(11,Months.DECEMBER,true,false));
        calendar.addDay(new Calendar.Day(25,Months.DECEMBER,true,true));

        calendar.showCalendar();
    }
}
