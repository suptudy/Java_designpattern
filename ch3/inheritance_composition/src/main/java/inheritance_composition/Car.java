package inheritance_composition;

public class Car {
    private String name;
    private Radio radio;

    public Car(String name) {
        this();
        this.name = name;

    }

    public Car() {
        this.name = null;
        this.radio = new Radio();
    }

    public void start() {
        System.out.println("자동차 출발");
    }

    public void stop() {
        System.out.println("자동차 정지");
    }

    public void radioOn() {
        this.radio.turnOn();
    }

    public void radioOff() {
        this.radio.turnOff();
    }
}
