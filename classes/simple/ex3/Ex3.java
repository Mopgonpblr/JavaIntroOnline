/**
 * 3. Создайте класс с именем Student, содержащий поля:
 * фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из
 * десяти элементов такого типа. Добавьте возможность
 * вывода фамилий и номеров групп студентов, имеющих
 * оценки, равные только 9 или 10.
 */
package classes.simple.ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    public static void showPerfect(Student[] students) {
        boolean isNotPerfect;
        for (Student student : students) {
            isNotPerfect = false;
            for (int j = 0; j < student.getMarks().length; j++) {
                if (student.getMarks()[j] < 9) {
                    isNotPerfect = true;
                    break;
                }
            }
            if (!isNotPerfect) {
                Matcher m = Pattern.compile("\\w+").matcher(student.getName());
                if (m.find()) {
                    System.out.println(m.group() + " " + student.getGroup());
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Pavlov K. V.", 1081222, new int[]{9, 9, 9, 10, 9});
        students[1] = new Student("Morozov V. V.", 1121122, new int[]{9, 9, 9, 10, 8});
        students[2] = new Student("Filin M. M.", 1081221, new int[]{8, 9, 9, 10, 10});
        students[3] = new Student("Chern F. T.", 1081221, new int[]{7, 6, 5, 6, 7});
        students[4] = new Student("Flopin G. Y.", 1081222, new int[]{9, 10, 9, 10, 10});
        students[5] = new Student("Kern C. N.", 1081221, new int[]{8, 9, 9, 7, 10});
        students[6] = new Student("Morin F. R.", 1021220, new int[]{9, 9, 9, 9, 9});
        students[7] = new Student("Shakin Y. R.", 1801221, new int[]{3, 9, 9, 5, 5});
        students[8] = new Student("Flukin H. L.", 1071221, new int[]{7, 9, 9, 10, 6});
        students[9] = new Student("Gamin G. P.", 1081222, new int[]{10, 9, 9, 10, 8});

        showPerfect(students);
    }
}

