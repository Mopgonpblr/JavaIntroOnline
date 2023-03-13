package oop.ex1;

import java.util.Scanner;


public class TextFile extends File {
    private final Scanner scanner = new Scanner(System.in);
    public StringBuilder text = new StringBuilder();

    public TextFile() {
        create();
    }

    public void create() {
        if (this.directory == null) {
            this.directory = new Directory();
            System.out.println("Enter the directory name: ");
            directory.setName(scanner.nextLine());
            System.out.println("Enter the directory path: ");
            directory.setPath(scanner.nextLine());
        }
        System.out.print("Enter the file name: ");
        String newString = scanner.nextLine();
        this.setName(newString + ".txt");
        System.out.println("File " + this + " created");
    }

    public void rename() {
        String old = this.toString();
        System.out.print("Enter the new file name: ");
        String newString = scanner.nextLine();
        this.setName(newString + ".txt");
        System.out.println("Old file name: "+old);
        System.out.println("New file name: "+this);
    }

    public void show() {
        System.out.println(text.toString());
    }

    public void add() {
        System.out.print("Enter the new text: ");
        String newString = scanner.nextLine();
        this.text.append(newString);
        System.out.println("Text added");
    }

    public void remove() {
        System.out.print("Enter the text you want to remove: ");
        String newString = scanner.nextLine();
        try {
            text.delete(text.indexOf(newString), text.indexOf(newString) + newString.length() + 1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Text not found");
        }
    }

    public String toString() {
        return this.directory + "\\" + this.getName();
    }
}
