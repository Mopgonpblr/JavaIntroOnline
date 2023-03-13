package tasks.ex2;

import tasks.ex2.beans.Note;
import tasks.ex2.comparators.SortByDate;
import tasks.ex2.comparators.SortByEmail;
import tasks.ex2.comparators.SortByTheme;


import java.io.FileWriter;
import java.lang.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notepad {
    private final ArrayList<Note> notes;

    public Notepad(String path) {
        this.notes = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(
                new FileReader(path))) {
            String s;
            while ((s = in.readLine()) != null) {
                String[] req = s.split("\\|");
                Note newNote = new Note(req[0], new SimpleDateFormat("dd/MM/yyyy").parse(req[1]), req[2], req[3]);
                this.notes.add(newNote);
            }
        } catch (IOException e) {
            System.out.println("Can't read file");
        } catch (ParseException e) {
            System.out.println("Date format exception");
        }
    }

    public ArrayList<Note> getNotes() {
        return this.notes;
    }

    public ArrayList<Note> findByWord(String word, ArrayList<Note> notes) {
        ArrayList<Note> found = new ArrayList<>();
        for (Note note : notes) {
            Matcher m = Pattern.compile("(" + word + "\\W)").matcher(note.getMessage());
            while (m.find()) {
                //System.out.println(m.group(1));
                if (!m.group(1).equals("")) {
                    found.add(note);
                    break;
                }
            }
        }
        return found;
    }

    public ArrayList<Note> findByTheme(String theme, ArrayList<Note> notes) {
        ArrayList<Note> found = new ArrayList<>();
        for (Note note : notes) {
            if (note.getTheme().equals(theme))
                found.add(note);
        }
        return found;
    }

    public ArrayList<Note> findByGroup(String theme, String word) {
        return findByWord(word, findByTheme(theme, getNotes()));
    }

    public ArrayList<Note> findByDate(String date, ArrayList<Note> notes) {
        ArrayList<Note> found = new ArrayList<>();
        try {
            for (Note note : notes) {
                if (note.getDate().equals(new SimpleDateFormat("dd/MM/yyyy").parse(date)))
                    found.add(note);
            }
        } catch (ParseException exc) {
            System.out.println("Wrong date value");
        }

        return found;
    }

    public boolean isEmailValid(String email) {
        Matcher m = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(email);
        while (m.find())
            if (m.group() != null)
                return true;
        return false;
    }

    public ArrayList<Note> findByEmail(String email, ArrayList<Note> notes) {
        ArrayList<Note> found = new ArrayList<>();
        if (isEmailValid(email)) {
            for (Note note : notes) {
                if (note.getEmail().equals(email))
                    found.add(note);
            }
        } else System.out.println("Wrong address format");

        return found;
    }

    public String addNote(String theme, String email, String message) {
        if (!isEmailValid(email))
            return "Invalid email address";
        for (Note note : notes) {
            if (note.getTheme().equals(theme) && note.getEmail().equals(email)
                    && note.getMessage().equals(message))
                return "This note already exists";
        }
        notes.add(new Note(theme, new Date(System.currentTimeMillis()), email, message));
        return "Note has been added";
    }

    public void save() {
        try (FileWriter out = new FileWriter("Notepad2.txt")) {
            for (Note note : notes)
                out.write(note + "\n");
        } catch (IOException e) {
            System.out.println("Can't read file");
        }
    }

}
