package kr.ac.gwnu.com.kwon;

public class IceFull implements Ice {

    @Override
    public String selectIce(int iceNum) {
        if (iceNum == 3) {
            return "Full 선택";
        }
        return null;
    }

}
