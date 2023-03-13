/**
 * 9. Создать класс Book, спецификация
 * которого приведена ниже. Определить
 * конструкторы, set- и get- методы и
 * метод toString(). Создать второй
 * класс, агрегирующий массив типа Book,
 * с подходящими конструкторами и
 * методами. Задать критерии выбора
 * данных и вывести эти данные на консоль.
 *
 * Book: id, название, автор(ы),
 * издательство, год издания, количество
 * страниц, цена, тип переплета.
 *
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным
 * издательством;
 * c) список книг, выпущенных после
 * заданного года.
 */
package classes.simple.ex9;

public class Ex9 {
    public static void main(String[] args) {
        Book book1 = new Book(12, "1984", "George Orwell", "Januskevic", 2021, 328, 9.99F, "hardcover");
        Book book2 = new Book(15, "Good Omens", "Neil Gaiman, Terry Pratchett", "Fox", 1990, 288, 5.59F, "hardcover");
        Book book3 = new Book(19, "The Colour of Magic", "Terry Pratchett", "Fox", 1983, 288, 19.99F, "paperback");

        Bookshop bookshop = new Bookshop(new Book[]{book1, book2, book3});
        bookshop.selectAuthor("Terry Pratchett");
        System.out.println();

        bookshop.selectPublisher("Fox");
        System.out.println();

        bookshop.selectYear(1989);
    }
}



