package kr.ac.gwnu.computer;

import java.util.Iterator;

public class Major implements Iterable<Student> {
    private int last;
    private String title;
    private int maxStudent;
    private Student[] students;

    public String getTitle() {
        return title;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public Major(String title, int maxStudent) {
        this.title = title;
        this.maxStudent = maxStudent;
        this.students = new Student[maxStudent];
        this.last = 0;
    }

    public void add(Student student) {
        this.students[last] = student;
        this.last++;
    }

    public int getNumberOfStudent() {
        return this.last;
    }

    public Student getStudentAt(int index) {
        return this.students[index - 1];
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(this);
    }
}
