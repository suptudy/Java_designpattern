package kr.ac.gwnu.com.command;

public class LampOffCommand implements Command {
    private Lamp lamp;

    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOff();
    }

}
