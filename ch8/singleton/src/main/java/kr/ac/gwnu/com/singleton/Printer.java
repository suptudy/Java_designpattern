package kr.ac.gwnu.com.singleton;

public class Printer {
    private static final Printer printer = new Printer();

    private Printer() {

    }

    public static Printer getInstance() {
        return printer;
    }

    public synchronized void print(String input) {
        System.out.println(input);
    }
}
