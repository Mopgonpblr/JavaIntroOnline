package classes.aggrComp.ex1;

import java.util.regex.Pattern;

public class Sentence {
    private Word[] words;
    private String[] punctuation;

    public Sentence() {
        this.words = new Word[0];
        this.punctuation = new String[0];
    }

    public Sentence(String sentence) {
        String[] temp = Pattern.compile("\\W+").split(sentence);
        words = new Word[temp.length];
        for (int i = 0; i < words.length; i++)
            words[i] = new Word(temp[i]);

        temp = Pattern.compile("\\w+").split(sentence);
        punctuation = new String[temp.length];
        System.arraycopy(temp, 1, punctuation, 0, words.length);

    }

    public void addWord(Word word) {
        Word[] temp = new Word[words.length + 1];
        String[] temp2 = new String[punctuation.length + 1];
        System.arraycopy(words, 0, temp, 0, words.length);
        temp[words.length] = word;
        temp2[punctuation.length] = " ";
        words = temp;
        punctuation = temp2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]).append(punctuation[i]);
        }
        return sb.toString();
    }
}
