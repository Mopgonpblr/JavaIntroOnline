/**
 * 7. Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки
 * пересечения медиан.
 */
package classes.simple.ex7;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 0, 2, 2, 3, -1);
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());
        System.out.println("Centroid: " + Arrays.toString(triangle.centroid()));
    }
}


