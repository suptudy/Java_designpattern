package kr.ac.gwnu.com.adaptor;

public class Professor {
    private String pid;
    private String fullName;
    private String location;

    public Professor(String pid, String fullName, String location) {
        this.pid = pid;
        this.fullName = fullName;
        this.location = location;
    }

    public String getPid() {
        return pid;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

}
