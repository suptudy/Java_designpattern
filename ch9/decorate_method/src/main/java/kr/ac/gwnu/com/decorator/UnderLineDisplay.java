package kr.ac.gwnu.com.decorator;

public class UnderLineDisplay implements Display {
    private Display dp;
    private char decoChar;

    public UnderLineDisplay(Display dp, char decoChar) {
        this.dp = dp;
        this.decoChar = decoChar;
    }

    @Override
    public int display() {
        int length = this.dp.display();
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(this.decoChar);
        }
        return length;
    }

}
