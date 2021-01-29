package ac.kr.gwnu.nostate;

public class ATMMachine {
    private int currentCash = 10000;
    private ATMstate currentState = ATMstate.NoCard;

    public ATMMachine() {

    }

    public int getCurrentCash() {
        return this.currentCash;
    }

    public void setCurrentCash(int currentCash) {
        this.currentCash = currentCash;
    }

    public void insertCard() {
        if (this.currentState == ATMstate.NoCard) {
            this.currentState = ATMstate.HasCard;
            System.out.println("카드 입력");
        } else if (this.currentState == ATMstate.HasCard) {
            System.out.println("이미 카드가 입력되어 있습니다");
        } else if (this.currentState == ATMstate.NoCash) {
            System.out.println("이미 카드가 입력되어 있습니다. [잔액부족]");
        }
    }

    public void ejectCard() {
        if (this.currentState == ATMstate.NoCard) {
            System.out.println("카드가 입력되어 있지 않습니다");
        } else if (this.currentState == ATMstate.HasCard) {
            this.currentState = ATMstate.NoCard;
            System.out.println("카드를 배출합니다");
        } else if (this.currentState == ATMstate.NoCash) {
            System.out.println("카드를 배출합니다 [잔액부족]");
        }
    }

    public void withdrawCash(int cash) {
        if (this.currentState == ATMstate.NoCard) {
            System.out.println("카드가 입력되어 있지 않습니다");
        } else if (this.currentState == ATMstate.HasCard) {
            if (this.currentCash < cash) {
                System.out.println("ATM 에 돈이 충분하지 않습니다");
            } else {
                this.currentCash = this.currentCash - cash;
                System.out.println(cash + "출금");
            }
            if (this.currentCash == 0) {
                this.currentState = ATMstate.NoCash;
            }
        } else if (this.currentState == ATMstate.NoCash) {
            System.out.println("ATM에 돈이 충분하지 않습니다.");
        }
    }
}
