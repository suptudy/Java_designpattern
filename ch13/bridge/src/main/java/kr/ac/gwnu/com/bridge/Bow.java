package kr.ac.gwnu.com.bridge;

public class Bow implements Weapon {

    @Override
    public void attack() {
        System.out.println("화살 발사");

    }

    @Override
    public void repair() {
        System.out.println("활 수리");

    }

}
