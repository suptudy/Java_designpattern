/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ac.kr.gwnu.nostate;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        atm.withdrawCash(100);
        atm.ejectCard();
        atm.insertCard();
        atm.insertCard();
        atm.withdrawCash(5000);
        atm.withdrawCash(7000);
        atm.withdrawCash(5000);
        atm.insertCard();
        atm.withdrawCash(1000);
        atm.ejectCard();
    }
}
