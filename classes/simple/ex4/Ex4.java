/**
 * 4. Создайте класс Train, содержащий поля:
 * название пункта назначения, номер поезда,
 * время отправления. Создайте данные в массив
 * из пяти элементов типа Train, добавьте
 * возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода
 * информации о поезде, номер которого введен
 * пользователем. Добавьте возможность сортировки
 * массив по пункту назначения, причем поезда с
 * одинаковыми пунктами назначения должны быть
 * упорядочены по времени отправления.
 */
package classes.simple.ex4;

import java.util.Scanner;

public class Ex4 {

    public static void sortNumber(Train[] trains) {
        for (int i = 1; i < trains.length; ) {
            if (trains[i].getNumber() < trains[i - 1].getNumber()) {
                Train temp = trains[i - 1];
                trains[i - 1] = trains[i];
                trains[i] = temp;
                i = 1;
            } else
                i++;
        }
    }

    public static String getInfo(Train[] trains, int number) {
        for (Train train : trains) {
            if (train.getNumber() == number) {
                return "Number: " + train.getNumber() +
                        "\nDestination: " + train.getDestination() +
                        "\nTime: " + train.getTime();
            }
        }
        return "No such train exists";
    }

    public static void sortDestination(Train[] trains) {
        for (int i = 1; i < trains.length; ) {
            if (trains[i].getDestination().compareTo(trains[i - 1].getDestination()) < 0 ||
                    (trains[i].getDestination().compareTo(trains[i - 1].getDestination()) == 0
                            && trains[i].getTime().compareTo(trains[i - 1].getTime()) < 0)) {
                Train temp = trains[i - 1];
                trains[i - 1] = trains[i];
                trains[i] = temp;
                i = 1;
            } else i++;
        }
    }

    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Smaliavicy", 712, "18:15");
        trains[1] = new Train("Barysau", 700, "17:10");
        trains[2] = new Train("Babrujsk", 658, "18:00");
        trains[3] = new Train("Smaliavicy", 712, "21:00");
        trains[4] = new Train("Homiel", 503, "20:30");

        System.out.println("Train number sorting");
        sortNumber(trains);
        for (Train train : trains) {
            System.out.println(train.getNumber() + " " + train.getDestination() + " " + train.getTime());
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the train number: ");
        int number = scan.nextInt();
        System.out.println(getInfo(trains, number));

        System.out.println("\nDestination and time sorting");
        sortDestination(trains);
        for (Train train : trains) {
            System.out.println(train.getNumber() + " " + train.getDestination() + " " + train.getTime());
        }
    }
}


