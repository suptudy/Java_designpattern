package kr.ac.gwnu.com.fm;

public class MD extends AirForceFactory {

    @Override
    protected AirForce createAirForce(String airForceType) {
        AirForce airForce = null;
        if (airForceType.equals("fighter")) {
            airForce = new Fighter("F35");
        }
        return airForce;
    }

    @Override
    protected void prepare(AirForce airForce) {
        airForce.chargeWeapon(5);
        System.out.println("맥도널드 더글러스 로고 프린트");
    }

}
