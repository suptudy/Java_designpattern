package ac.kr.gwnu.com;

public class Fighter extends AirForce {
    private int missile;

    public Fighter(int missile) {
        this.missile = missile;
    }

    @Override
    public void fight() {
        for (int i = 0; i < missile; i++) {
            System.out.println("미사일 발사");
        }
        this.missile = 0;
    }
}
