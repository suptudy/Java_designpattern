package kr.ac.gwnu.com.fm;

public class WarManager {
    private AirForceFactory f1;
    private AirForceFactory f2;

    public WarManager(AirForceFactory f1, AirForceFactory f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public void attack() {
        AirForce fighter1 = f1.create("fighter");
        AirForce fighter2 = f2.create("fighter");
        fighter1.takeOff();
        fighter2.takeOff();
        fighter1.fly();
        fighter2.fly();
        fighter1.fight();
        fighter2.fight();
        fighter1.fly();
        fighter2.fly();
        fighter1.land();
        fighter2.land();
    }
}
