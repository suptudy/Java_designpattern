package wargame;

public class Bomber extends AirForcePlane {
    private int bomb;

    public Bomber(int bomb) {
        this.bomb = bomb;
    }

    @Override
    public void takeOff() {
        System.out.println("폭격기 발진");
    }

    @Override
    public void fly() {
        System.out.println("폭격기 비행");
    }

    @Override
    public void attack() {
        while (this.bomb != 0) {
            System.out.println("폭탄 투하");
            this.bomb = this.bomb - 1;
        }
    }

    @Override
    public void land() {
        System.out.println("폭격기 착륙");
    }
}
