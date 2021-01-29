package kr.ac.gwnu.com.state;

public class ATMMachine {
    private ATMState noCardState = null;
    private ATMState hasCardState = null;
    private ATMState noCashState = null;
    private ATMState currentState = null;
    private int currentCash = 0;

    public ATMMachine() {
        this.noCardState = new NoCard();
        this.hasCardState = new HasCard();
        this.noCashState = new NoCash();
        this.currentState = this.noCardState;
        this.currentCash = 10000;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public int getCurrentCash() {
        return currentCash;
    }

    public void setCurrentCash(int currentCash) {
        this.currentCash = currentCash;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public void setCurrentState(ATMState state) {
        this.currentState = state;
    }

    public void insertCard() {
        this.currentState.insertCard(this);
    }

    public void ejectCard() {
        this.currentState.ejectCard(this);
    }

    public void withdrawCash(int money) {
        this.currentState.withdrawCash(this, money);
    }
}
