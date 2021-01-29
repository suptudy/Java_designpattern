package kr.ac.gwnu.com.bridge;

public class Warrior implements WeaponHandler {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void handle() {
        weapon.attack();

    }

}
