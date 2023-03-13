/**
 * Создать объект класса Текстовый файл,
 * используя классы Файл, Директория.
 * Методы: создать, переименовать,
 * вывести на консоль содержимое,
 * дополнить, удалить.
 */
package oop.ex1;

public class Ex1 {
    public static void main(String[] args) {
        //new file creation
        TextFile tx1 = new TextFile();
        //Adding new text to the file
        tx1.add();
        tx1.show();
        //Removing text from the file
        tx1.remove();
        tx1.show();
        //renaming the file
        tx1.rename();
    }
}
