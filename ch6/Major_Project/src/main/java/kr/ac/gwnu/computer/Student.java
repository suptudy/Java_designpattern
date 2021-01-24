package kr.ac.gwnu.computer;

public class Student {
    private String stuID;
    private String name;

    public Student(String stuID, String name) {
        this.stuID = stuID;
        this.name = name;
    }

    public String getID() {
        return this.stuID;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        Student temp_student = (Student) obj;
        return this.stuID == temp_student.getID();
    }
}
