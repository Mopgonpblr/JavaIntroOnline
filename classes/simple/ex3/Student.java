package classes.simple.ex3;

public class Student {
    private String name;
    private int group;
    private int[] marks;

    public Student(String name, int group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int[] getMarks() {
        return marks;
    }
}
