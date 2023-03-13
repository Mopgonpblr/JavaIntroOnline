package tasks.ex1.beans;

public class Book {
    private String name;
    private String author;
    private int pages;
    private Type type;

    public Book(String name, String author, int pages, String type) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.type = Type.valueOf(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(this.name).append("|").append(this.author).append("|").
                append(this.pages).append("|").append(this.type);
        return sb.toString();
    }
}
