package kr.ac.gwnu.com.fm;

public class Boeing extends AirForceFactory {

    @Override
    protected AirForce createAirForce(String airForceType) {
        AirForce airForce = null;
        if (airForceType.equals("fighter")) {
            airForce = new Fighter("F15");
        }
        return airForce;
    }

    @Override
    protected void prepare(AirForce airForce) {
        airForce.chargeWeapon(10);
        System.out.println("보잉 로고 프린팅");

    }

}
