package classes.aggrComp.ex1;

import java.util.regex.Pattern;

public class Word {
    private String word;

    public Word(String word) {
        this.word = Pattern.compile("\\W+").split(word)[0];
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return this.word;
    }
}
