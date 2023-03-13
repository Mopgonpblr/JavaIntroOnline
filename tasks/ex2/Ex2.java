package tasks.ex2;


import tasks.ex2.beans.Note;
import tasks.ex2.comparators.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    static Scanner scanner = new Scanner(System.in);
    static Notepad notepad = new Notepad("notepad.txt"); //reads catalogue base from file

    public static void main(String[] args) {

        int i = -1;
        do {
            System.out.println("1. Show all notes");
            System.out.println("2. Find");
            System.out.println("3. Add new note");
            try {
                i = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exc) {
                System.out.println("Only numbers are allowed");
            }
            switch (i) {
                case 1:
                    System.out.println("All notes");
                    for (Note note : notepad.getNotes())
                        System.out.println(note);
                    break;
                case 2:
                    find();
                    break;
                case 3:
                    add();
                default:
                    break;
            }
        } while (i != 0);

        notepad.save();
    }

    static void add() {
        System.out.print("Theme: ");
        String theme = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Message: ");
        String message = scanner.nextLine();
        System.out.println(notepad.addNote(theme, email, message));
    }

    static ArrayList<Note> sort(ArrayList<Note> notes) {
        System.out.println("1. Sort by date");
        System.out.println("2. Sort by theme");
        System.out.println("3. Sort by email");
        int i = -1;
        try {
            i = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exc) {
            System.out.println("Only numbers are allowed");
        }
        switch (i) {
            case 1:
                notes.sort(new SortByDate());
                break;
            case 2:
                notes.sort(new SortByTheme());
                break;
            case 3:
                notes.sort(new SortByEmail());
                break;
            default:
                break;
        }
        return notes;
    }

    static void find() {
        ArrayList<Note> notes = new ArrayList<>();

        System.out.println("1. Find by date");
        System.out.println("2. Find by word");
        System.out.println("3. Find by theme");
        System.out.println("4. Find by group(theme,word)");
        System.out.println("5. Find by email");
        int i = -1;
        try {
            i = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exc) {
            System.out.println("Only numbers are allowed");
        }
        switch (i) {
            case 1:
                System.out.print("Date:");
                String date = scanner.nextLine();//"30/12/1998"
                notes = notepad.findByDate(date, notepad.getNotes());
                break;
            case 2:
                System.out.print("Word:");
                String word = scanner.nextLine();//"message"
                notes = notepad.findByWord(word, notepad.getNotes());
                break;
            case 3:
                System.out.print("Theme:");
                String theme = scanner.nextLine();//"Theme"
                notes = notepad.findByTheme(theme, notepad.getNotes());
                break;
            case 4:
                System.out.print("Theme:");
                theme = scanner.nextLine();//"Theme"
                System.out.print("Word:");
                word = scanner.nextLine();//"message"
                notes = notepad.findByGroup(theme, word);
                break;
            case 5:
                System.out.print("Email:");
                String email = scanner.nextLine();//"mop@ga.com"
                notes = notepad.findByEmail(email, notepad.getNotes());
                break;
            default:
                break;
        }

        for (Note note : sort(notes))
            System.out.println(note);
    }
}
