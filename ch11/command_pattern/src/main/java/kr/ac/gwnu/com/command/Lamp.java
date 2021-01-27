package kr.ac.gwnu.com.command;

public class Lamp {
    private String name;

    public Lamp(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(this.name + " 켜기");
    }

    public void turnOff() {
        System.out.println(this.name + " 끄기");
    }
}
