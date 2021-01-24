package kr.ac.gwnu.com.adaptor;

public class UniversityDB {
    public UniversityDB() {
        System.out.println("DB 생성");
    }

    public void registerMember(IMember member) {
        String info = member.getID() + ":" + member.getName() + ":" + member.getAddress();
        System.out.println("등록");
        System.out.println(info);
    }
}
