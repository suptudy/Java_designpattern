package kr.ac.gwnu.com.kwon;

public class ForHere extends Customer {
    private String name = null;

    public ForHere(String name) {
        super(name);
        this.name = "매장 손님";
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
