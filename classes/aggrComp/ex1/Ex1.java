/**
 * 1. Создать объект класса Текст,
 * используя классы Предложение,
 * Слово.
 * Методы: дополнить текст, вывести
 * на консоль текст, заголовок текста.
 */

package classes.aggrComp.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Text text = new Text();
        text.setHeader("A new text");
        Sentence sentence = new Sentence("It can be better, can't it?");
        text.addSentence(sentence);
        text.show();
        text.showHeader();
    }
}






