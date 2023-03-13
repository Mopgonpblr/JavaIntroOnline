package classes.aggrComp.ex1;

public class Text {
    private Sentence[] sentences;
    private String header;

    public Text() {
        this.sentences = new Sentence[0];
        this.header = "";
    }

    public void addSentence(Sentence sentence) {
        Sentence[] temp = new Sentence[this.sentences.length + 1];
        System.arraycopy(sentences, 0, temp, 0, sentences.length);
        temp[sentences.length] = sentence;
        sentences = temp;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void showHeader() {
        System.out.println(this.header);
    }
    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t").append(header).append("\n");
        for (Sentence sentence : sentences)
            sb.append(sentence);
        return sb.toString();
    }
}
