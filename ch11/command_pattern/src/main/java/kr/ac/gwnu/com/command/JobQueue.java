package kr.ac.gwnu.com.command;

import java.util.ArrayList;

public class JobQueue {
    private ArrayList<Command> queue;

    public JobQueue() {
        this.queue = new ArrayList<Command>();
    }

    public void add(Command command) {
        this.queue.add(command);
    }

    public void execute() {
        for (Command command : this.queue) {
            command.execute();
        }
    }

    public void removeAll() {
        this.queue.clear();
    }
}
