package tasks.ex2.comparators;

import tasks.ex2.beans.Note;

import java.util.*;

public class SortByTheme implements Comparator<Note> {

    public int compare(Note a, Note b) {
        return a.getTheme().compareTo(b.getTheme());
    }
}
