//basics/Cycle6.java

/**
 * 6. Вывести на экран соответствий между символами
 * и их численными обозначениями в памяти компьютера.
*/

package basics;

public class Cycle6
{
    public static void main(String[] args) {

        for (int n = 0; n < 65538; n++){
            System.out.println((char)n + " " + n);
        }
    }
}
