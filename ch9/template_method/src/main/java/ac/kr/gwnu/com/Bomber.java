package ac.kr.gwnu.com;

public class Bomber extends AirForce {
    private int bomb;

    public Bomber(int bomb) {
        this.bomb = bomb;
    }

    @Override
    public void fight() {
        for (int i = 0; i < this.bomb; i++) {
            System.out.println("폭탄투하");
        }
        this.bomb = 0;
    }
}
