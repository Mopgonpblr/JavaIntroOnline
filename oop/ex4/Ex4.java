/**
 * Создать консольное приложение,
 * удовлетворяющее следующим требованиям:
 * • Приложение должно быть объектно-,
 * а не процедурно-ориентированным.
 * • Каждый класс должен иметь отражающее
 * смысл название и информативный состав.
 * • Наследование должно применяться только
 * тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы
 * соглашения об оформлении кода java
 * code convention.
 * • Классы должны быть грамотно разложены
 * по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения данных можно использовать
 * файлы.
 * <p>
 * Дракон и его сокровища. Создать программу,
 * позволяющую обрабатывать сведения о 100
 * сокровищах в пещере дракона. Реализовать
 * возможность просмотра сокровищ, выбора
 * самого дорогого по стоимости сокровища и
 * выбора сокровищ на заданную сумму.
 */

package oop.ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreasurePile tp = new TreasurePile("base.txt");

        while (true) {
            System.out.println("1. Show dragon treasures");
            System.out.println("2. Pick the most expensive treasure");
            System.out.println("3. Pick treasures for a limited sum");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    tp.show();
                    break;
                case 2:
                    System.out.println(tp.pickMostExpensive());
                    break;
                case 3:
                    System.out.println("Enter the sum:");
                    int sum = scanner.nextInt();
                    System.out.println(tp.pick(sum));
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
