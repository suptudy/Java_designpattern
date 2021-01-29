package kr.ac.gwnu.com.bridge;

public class Smith implements WeaponHandler {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void handle() {
        weapon.repair();

    }

}
