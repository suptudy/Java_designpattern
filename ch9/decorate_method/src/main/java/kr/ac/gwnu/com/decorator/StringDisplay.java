package kr.ac.gwnu.com.decorator;

public class StringDisplay implements Display {
    private String message;

    public StringDisplay(String message) {
        this.message = message;
    }

    @Override
    public int display() {
        System.out.print(this.message);
        return this.message.length();
    }
}
