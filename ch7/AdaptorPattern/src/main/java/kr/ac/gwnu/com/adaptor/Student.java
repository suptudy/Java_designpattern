package kr.ac.gwnu.com.adaptor;

public class Student implements IMember {
    private String sid;
    private String sname;
    private String saddress;

    public Student(String sid, String sname, String saddress) {
        this.sid = sid;
        this.sname = sname;
        this.saddress = saddress;
    }

    @Override
    public String getID() {
        return this.sid;
    }

    @Override
    public String getName() {
        return this.sname;
    }

    @Override
    public String getAddress() {
        return this.saddress;
    }

}
