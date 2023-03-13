package tasks.ex2.comparators;

import tasks.ex2.beans.Note;

import java.util.Comparator;

public class SortByDate implements Comparator<Note> {

    public int compare(Note a, Note b) {
        return a.getDate().compareTo(b.getDate());
    }
}
