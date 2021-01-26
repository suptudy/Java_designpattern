package ac.kr.gwnu.com;

public class LazerFighter extends AirForce {
    private int lazer;

    public LazerFighter(int lazer) {
        this.lazer = lazer;
    }

    @Override
    public void fight() {
        for (int i = 0; i < this.lazer; i++) {
            System.out.println("레이저 발사");
        }
        this.lazer = 0;

    }

}
