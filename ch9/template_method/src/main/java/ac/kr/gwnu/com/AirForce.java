package ac.kr.gwnu.com;

public abstract class AirForce {
    public AirForce() { // default 생성자

    }

    public void takeOff() {
        System.out.println("이륙");
    }

    public void fly() {
        System.out.println("날라가기");
    }

    public abstract void fight();

    public void land() {
        System.out.println("착륙");
    }

    public void attack() {
        takeOff();
        fly();
        fight();
        fly();
        land();
    }
}
