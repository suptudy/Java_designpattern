package kr.ac.gwnu.com.command;

public class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.turnOn();

    }
}
