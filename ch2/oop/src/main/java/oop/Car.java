package oop;

public class Car {
    protected String name;
    protected int speed;

    public Car(String name) {
        this.name = name;
        this.speed = 0;
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        this.speed = 20;
        System.out.println("출발");
        System.out.println("속도: " + this.speed);
    }

    public void accelerate() {
        this.speed = this.speed + 30;
        System.out.println("가속!");
        System.out.println("속도: " + this.speed);
    }

    public void stop() {
        this.speed = 0;
        System.out.println("정지!");
        System.out.println("속도: " + this.speed);
    }
}
