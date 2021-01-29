package kr.ac.gwnu.com.bridge;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("칼 공격");
    }

    @Override
    public void repair() {
        System.out.println("칼 수리");

    }

}
