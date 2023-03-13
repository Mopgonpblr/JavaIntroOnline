/**
 * 2. Создать объект класса Автомобиль,
 * используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять
 * колесо, вывести на консоль марку
 * автомобиля.
 */
package classes.aggrComp.ex2;

import java.util.Random;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        Automobile car = new Automobile("Dodge Neon", 11, 28);
        car.drive(150);
        for (Wheel wheel : car.getWheels())
            if (!wheel.isOkay()) {
                car.changeWheel(wheel);
                break;
            }
        car.drive(250);
        car.fillTank(5);
        car.drive(50);
    }
}





