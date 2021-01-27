package kr.ac.gwnu.com.command;

public class LampOnCommand implements Command {
    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOn();

    }

}
