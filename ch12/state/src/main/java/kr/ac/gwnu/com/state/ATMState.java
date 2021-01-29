package kr.ac.gwnu.com.state;

public interface ATMState {
    void insertCard(ATMMachine machine);

    void ejectCard(ATMMachine machine);

    void withdrawCash(ATMMachine machine, int money);
}
