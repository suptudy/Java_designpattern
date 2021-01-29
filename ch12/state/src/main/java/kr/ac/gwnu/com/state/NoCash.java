package kr.ac.gwnu.com.state;

public class NoCash implements ATMState {

    @Override
    public void insertCard(ATMMachine machine) {
        System.out.println("이미 카드가 입력되어 있습니다. [잔고 부족]");

    }

    @Override
    public void ejectCard(ATMMachine machine) {
        System.out.println("카드를 배출합니다. [잔고 부족]");
        machine.setCurrentState(machine.getNoCardState());
    }

    @Override
    public void withdrawCash(ATMMachine machine, int money) {
        System.out.println("ATM에 돈이 충분하지 않습니다. [잔고 부족]");

    }

}
