package kr.ac.gwnu.com.fm;

public abstract class AirForceFactory {
    public AirForce create(String airForceType) {
        AirForce airForce = createAirForce(airForceType);
        prepare(airForce);
        return airForce;
    }

    protected abstract AirForce createAirForce(String airForceType);

    protected abstract void prepare(AirForce airForce);
}
