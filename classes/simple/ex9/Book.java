package classes.simple.ex9;

public class Book {
    private int id;
    private String name;
    private String authors;
    private String publisher;
    private int year;
    private int pages;
    private double cost;
    private String cover;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getAuthors() {
        return authors;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Book(int id, String name, String authors, String publisher, int year, int pages, double cost, String cover) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
        this.cover = cover;
    }

    public String toString() {
        return this.id + " | " + this.name + " | " + this.authors + " | " + this.publisher + " | " + this.year + " | " + this.pages + " | " + this.cost + " | " + this.cover;
    }
}
