package kr.ac.gwnu.com.state;

public class NoCard implements ATMState {

    @Override
    public void insertCard(ATMMachine machine) {
        System.out.println("카드 입력");
        machine.setCurrentState(machine.getHasCardState());
    }

    @Override
    public void ejectCard(ATMMachine machine) {
        System.out.println("카드가 입력되어 있지 않습니다.");

    }

    @Override
    public void withdrawCash(ATMMachine machine, int money) {
        System.out.println("입력된 카드가 없어서 출금을 할 수 없습니다.");

    }

}
