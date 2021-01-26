package kr.ac.gwnu.com.decorator;

public class BorderDisplay implements Display {
    private Display dp;
    private char decoChar;

    public BorderDisplay(Display dp, char decoChar) {
        this.dp = dp;
        this.decoChar = decoChar;
    }

    @Override
    public int display() {
        int length = 0;
        System.out.print(this.decoChar);
        this.dp.display();
        System.out.println(this.decoChar);

        return length + 2;
    }
}
