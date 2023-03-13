package classes.simple.ex9;

public class Bookshop {

    private Book[] books;


    public Bookshop(Book[] books) {
        this.books = books;
    }

    public void selectAuthor(String author) {
        System.out.println(author + " books");
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                System.out.println(book);
            }
        }
    }

    public void selectPublisher(String publisher) {
        System.out.println("Books published by " + publisher);
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book);
            }
        }
    }

    public void selectYear(int year) {
        System.out.println("Books published after " + year);
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book);
            }
        }
    }
}
