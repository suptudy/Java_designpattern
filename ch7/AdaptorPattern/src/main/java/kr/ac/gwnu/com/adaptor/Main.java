package kr.ac.gwnu.com.adaptor;

public class Main {
    public static void main(String[] args) {
        UniversityDB db = new UniversityDB();
        Student student = new Student("s0001", "홍길동", "원주");
        ProfessorAdaptor professor = new ProfessorAdaptor("p0001", "이몽룡", "원주");
        db.registerMember(student);
        db.registerMember(professor);

        Professor pf = new Professor("0002", "심청", "흥성");
        AdaptorProfessor ap = new AdaptorProfessor(pf);
        db.registerMember(ap);
    }
}
