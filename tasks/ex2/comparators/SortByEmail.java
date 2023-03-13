package tasks.ex2.comparators;

import tasks.ex2.beans.Note;

import java.util.Comparator;

public class SortByEmail implements Comparator<Note> {

    public int compare(Note a, Note b) {
        return a.getEmail().compareTo(b.getEmail());
    }
}
