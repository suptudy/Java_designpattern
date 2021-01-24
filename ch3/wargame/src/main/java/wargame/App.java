/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wargame;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void commitWarScenario(AirForcePlaneAble aPlane) {
        aPlane.displayPlaneType();
        gotoBattle(aPlane);
        fight(aPlane);
        backFromBattle(aPlane);
    }

    public static void gotoBattle(FlyAble fa) {
        fa.takeOff();
        fa.fly();
    }

    public static void fight(FightAble fa) {
        fa.attack();
    }

    public static void backFromBattle(FlyAble fa) {
        fa.fly();
        fa.land();

    }

    public static void main(String[] args) {
        Fighter1 f15 = new Fighter1(10);
        // AirForcePlane f15 = new Fighter(10);
        Bomber1 b29 = new Bomber1(10);
        // AirForcePlane b29 = new Bomber(10);

        commitWarScenario(f15);
        commitWarScenario(b29);
    }
}