package kr.ac.gwnu.com.kwon;

public class IceRegular implements Ice {

    @Override
    public String selectIce(int iceNum) {
        if (iceNum == 2) {
            return "Regular 선택";
        }
        return null;
    }

}
