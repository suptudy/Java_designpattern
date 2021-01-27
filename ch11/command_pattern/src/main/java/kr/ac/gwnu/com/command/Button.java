package kr.ac.gwnu.com.command;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void push() {
        this.command.execute();
    }

}
