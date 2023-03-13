package tasks.ex1;

import tasks.ex1.beans.Book;
import tasks.ex1.beans.Role;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class Catalogue {

    private final Collection<Book> books;

    public Catalogue(String path) {
        this.books = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(
                new FileReader(path))) {

            String s;
            while ((s = in.readLine()) != null) {
                String[] req = s.split("\\|");
                Book newBook = new Book(req[0], req[1], Integer.parseInt(req[2]), req[3]);
                this.books.add(newBook);
            }
        } catch (IOException e) {
            System.out.println("Can't read file");
        }
    }

    //Shows a page with 10 books on it
    public void show(int page) {
        for (int i = page * 10 - 10; i < page * 10 && i < this.books.size(); i++)
            System.out.println(this.books.toArray()[i]);
    }

    //Searches all the books of this author
    public void searchByAuthor(String author) {
        for (Book book : this.books)
            if (book.getAuthor().equals(author))
                System.out.println(book);
    }

    //Searches all the books with such name
    public void searchByName(String name) {
        for (Book book : this.books)
            if (book.getName().equals(name))
                System.out.println(book);
    }

    //Searches all the books of such type
    public void searchByType(String type) {
        for (Book book : this.books)
            if (book.getType().name().equals(type))
                System.out.println(book);
    }

    //Checks the user role. If it's administrator, the book's being added to the base
    public void addBook(Book book, String path) {
        if (CurrentUser.getInstance().getRole() == Role.ADMINISTRATOR) {
            try (PrintWriter out = new PrintWriter(
                    new BufferedWriter(new FileWriter(path, true)))) {

                out.write(book.toString());
                System.out.println("The book has been added");
            } catch (IOException e) {
                System.out.println("File not found");
            }
        } else {
            offerBook(book);
        }
    }


    public void offerBook(Book book) {
        System.out.println("The administrator will check your offer");
        //TO-DO
    }

}
