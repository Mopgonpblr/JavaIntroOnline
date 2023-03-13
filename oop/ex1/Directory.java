package oop.ex1;

public class Directory {
    private String path;
    private String name;

    public Directory() {
        this.path = "C:\\";
        this.name = "New Folder";
    }

    public Directory(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.path + this.name;
    }
}
