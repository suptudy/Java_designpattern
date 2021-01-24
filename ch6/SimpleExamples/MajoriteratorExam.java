public class MajoriteratorExam {
    public static void main(String[] args) {
        Major computer = new Major("컴퓨터공학", 3);
        computer.add(new Student("0001", "권수빈"));
        computer.add(new Student("0002", "전동석"));
        computer.add(new Student("0003", "박은태"));

        for (Student student : computer) {
            System.out.println(student.getName());
        }

        Iterator<Student> studentIterator = computer.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().getName());
        }
    }
}
