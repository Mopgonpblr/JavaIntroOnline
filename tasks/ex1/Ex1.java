package tasks.ex1;

import tasks.ex1.beans.Book;

import java.util.Scanner;

public class Ex1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Catalogue books = new Catalogue("catalogue.txt"); //reads catalogue base from file
        authorize(); //authorizes the user
        int i;
        do {
            System.out.println("1. Show books");
            System.out.println("2. Search a book");
            System.out.println("3. Add/Offer a book");
            i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 1:
                    show(books);
                    break;
                case 2:
                    search(books);
                    break;
                case 3:
                    add(books);
                    break;
                default:
                    break;
            }
        } while (i != 0);
    }

    //Authorizes the user
    public static void authorize() {
        Users users = new Users("userbase.txt");
        boolean success = false;
        while (!success) {
            System.out.println("Login:");
            String login = scanner.nextLine();
            System.out.println("Password:");
            String password = scanner.nextLine();
            success = users.authorize(login, password);
        }
    }

    //Searches the book catalogue for books by their names, authors and types
    public static void search(Catalogue books) {
        System.out.println("1. Search by name");
        System.out.println("2. Search by author");
        System.out.println("3. Search by type");
        int i = Integer.parseInt(scanner.nextLine());
        switch (i) {
            case 1:
                System.out.println("Name: ");
                String name = scanner.nextLine();
                books.searchByName(name);
                break;
            case 2:
                System.out.println("Author: ");
                String author = scanner.nextLine();
                books.searchByAuthor(author);
                break;
            case 3:
                System.out.println("Type: ");
                String type = scanner.nextLine();
                books.searchByType(type);
                break;
            default:
                break;
        }
    }

    //Adds a new book to the catalogue
    public static void add(Catalogue books) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Author: ");
        String author = scanner.nextLine();
        System.out.println("Pages: ");
        int pages = Integer.parseInt(scanner.nextLine());
        System.out.println("Type: ");
        String type = scanner.nextLine();
        books.addBook(new Book(name, author, pages, type), "catalogue.txt");
    }

    public static void show(Catalogue books) {
        int page;
        do {
            System.out.println("Page: ");
            page = Integer.parseInt(scanner.nextLine());
            if (page > 0)
                books.show(page);
        } while (page != 0);
    }
}
