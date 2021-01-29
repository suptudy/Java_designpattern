package kr.ac.gwnu.com.state;

public class HasCard implements ATMState {

    @Override
    public void insertCard(ATMMachine machine) {
        System.out.println("카드가 이미 있습니다.");
        machine.setCurrentState(machine.getHasCardState());
    }

    @Override
    public void ejectCard(ATMMachine machine) {
        System.out.println("카드 출력");
        machine.setCurrentState(machine.getNoCardState());
    }

    @Override
    public void withdrawCash(ATMMachine machine, int money) {
        int currentCash = machine.getCurrentCash();
        if (currentCash < money) {
            System.out.println("ATM에 돈이 충분하지 않습니다");
        } else {
            System.out.println(money + "출금");
            int remainCash = currentCash - money;
            machine.setCurrentCash(remainCash);
        }

        currentCash = machine.getCurrentCash();
        if (currentCash == 0) {
            machine.setCurrentState(machine.getNoCashState());
        }

    }

}
