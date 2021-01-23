package kr.ac.gwnu.com.kwon;

public class ToGo extends Customer {
    private String name = null;

    public ToGo(String name) {
        super(name);
        this.name = "포장 손님";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String type() {
        return this.name;

    }

}
