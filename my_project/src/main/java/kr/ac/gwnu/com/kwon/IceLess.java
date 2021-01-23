package kr.ac.gwnu.com.kwon;

public class IceLess implements Ice {

    @Override
    public String selectIce(int iceNum) {
        if (iceNum == 1) {
            return "Less 선택";
        }
        return null;
    }
}
