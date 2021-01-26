package kr.ac.gwnu.com.fm;

public class Fighter implements AirForce {
    private String type;
    private int weapon;

    public Fighter(String type) {
        this.setType(type);
        this.weapon = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void takeOff() {
        System.out.println("전투기 발진");

    }

    @Override
    public void fly() {
        System.out.println("전투기 비행");

    }

    @Override
    public void land() {
        System.out.println("전투기 착륙");

    }

    @Override
    public void fight() {
        for (int i = 0; i < this.weapon; i++) {
            System.out.println("미사일 발사");
        }
        this.weapon = 0;
    }

    @Override
    public void chargeWeapon(int weapon) {
        this.weapon = weapon; // 무기의 개수를 채워줌

    }

}
